package kh2;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh2.l f389536d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kh2.l lVar) {
        super(4);
        this.f389536d = lVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        boolean z17;
        final byte[] buf = (byte[]) obj;
        final int intValue = ((java.lang.Number) obj2).intValue();
        final float floatValue = ((java.lang.Number) obj3).floatValue();
        final float[][] fArr = (float[][]) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buf, "buf");
        kh2.l lVar = this.f389536d;
        lh2.a aVar = lVar.f389540d;
        if (aVar != null) {
            aVar.b(buf, intValue);
        }
        final oy5.h hVar = (oy5.h) lVar.i();
        hVar.getClass();
        com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65793x233c02ec.getClass();
        z17 = com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65794x141089db;
        if (z17) {
            android.os.Handler handler = hVar.f431650f;
            if (handler == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scoreHandler");
                throw null;
            }
            handler.post(new java.lang.Runnable() { // from class: oy5.h$$d
                @Override // java.lang.Runnable
                public final void run() {
                    oy5.h this$0 = oy5.h.this;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                    this$0.f431647c.m122307x59410075(buf, floatValue, intValue, fArr);
                }
            });
        }
        return jz5.f0.f384359a;
    }
}
