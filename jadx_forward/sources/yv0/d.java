package yv0;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yv0.f f547491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a f547492e;

    public d(yv0.f fVar, double d17, com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a c4176xaeba704a) {
        this.f547491d = fVar;
        this.f547492e = c4176xaeba704a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10944xceb8a619 i17 = this.f547491d.i();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a offsetRange = this.f547492e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(offsetRange, "offsetRange");
        i17.invalidate();
    }
}
