package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78;

/* loaded from: classes2.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14877xc2c814e1 f204893d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14877xc2c814e1 c14877xc2c814e1) {
        this.f204893d = c14877xc2c814e1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14877xc2c814e1 c14877xc2c814e1 = this.f204893d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1456x30012e.C13830x9baef275 c13830x9baef275 = c14877xc2c814e1.f204876f;
        if (c13830x9baef275 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutManager");
            throw null;
        }
        int i17 = c13830x9baef275.f188296p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.b bVar = c14877xc2c814e1.f204874d;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        int b17 = bVar.f204888b.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCollectionFilterView", "refreshArrow: " + i17 + ", " + b17);
        android.widget.TextView textView = c14877xc2c814e1.f204877g;
        if (textView != null) {
            textView.setVisibility(i17 >= b17 ? 8 : 0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreArrow");
            throw null;
        }
    }
}
