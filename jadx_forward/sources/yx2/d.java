package yx2;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx2.f f549369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f549370e;

    public d(yx2.f fVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        this.f549369d = fVar;
        this.f549370e = c19792x256d2725;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yx2.f fVar = this.f549369d;
        android.widget.TextView textView = fVar.f549377c;
        fVar.getClass();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = this.f549370e.m76802x2dd01666();
        java.lang.String m76944x730bcac6 = m76802x2dd01666 != null ? m76802x2dd01666.m76944x730bcac6() : null;
        if (m76944x730bcac6 == null) {
            m76944x730bcac6 = "";
        }
        textView.setText(m76944x730bcac6);
    }
}
