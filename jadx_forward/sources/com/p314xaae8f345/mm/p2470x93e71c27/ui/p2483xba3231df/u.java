package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class u implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f272527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v f272528b;

    public u(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v vVar) {
        this.f272527a = arrayList;
        this.f272528b = vVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f272527a.remove(data);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.a
    public void b(java.lang.ref.WeakReference weakReference) {
        kb0.g gVar = this.f272528b.f272543k;
        if (gVar != null) {
            gVar.f387741l = weakReference;
        }
    }
}
