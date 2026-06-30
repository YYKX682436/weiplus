package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class sj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f186091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(android.view.ViewGroup viewGroup) {
        super(0);
        this.f186091d = viewGroup;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.KeyEvent.Callback childAt = this.f186091d.getChildAt(0);
        k20.h hVar = childAt instanceof k20.h ? (k20.h) childAt : null;
        if (hVar != null) {
            hVar.a(false);
        }
        return jz5.f0.f384359a;
    }
}
