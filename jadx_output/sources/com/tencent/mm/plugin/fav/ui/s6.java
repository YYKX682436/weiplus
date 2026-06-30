package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public class s6 implements w82.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavTagEditUI f101436a;

    public s6(com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI) {
        this.f101436a = favTagEditUI;
    }

    @Override // w82.m0
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = this.f101436a;
        if (favTagEditUI.f100417g.getTagList().contains(str2)) {
            favTagEditUI.f100417g.p(str);
            return;
        }
        for (int i17 = 0; i17 < favTagEditUI.f100417g.getChildCount(); i17++) {
            android.view.View childAt = favTagEditUI.f100417g.getChildAt(i17);
            if (childAt.getClass() == android.widget.TextView.class) {
                android.widget.TextView textView = (android.widget.TextView) childAt;
                if (textView.getText().toString().equals(str)) {
                    textView.setText(str2);
                    childAt.invalidate();
                }
            }
        }
        favTagEditUI.f100417g.v(str, str2);
    }

    @Override // w82.m0
    public void b(java.lang.String str) {
        this.f101436a.f100417g.p(str);
    }
}
