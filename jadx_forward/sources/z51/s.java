package z51;

/* loaded from: classes10.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f551754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z51.w f551755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f551756f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z51.w wVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f551755e = wVar;
        this.f551756f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        z51.s sVar = new z51.s(this.f551755e, this.f551756f, interfaceC29045xdcb5ca57);
        sVar.f551754d = obj;
        return sVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((z51.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f551754d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load bitmap finish >> height: ");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f551756f;
        sb6.append(((android.graphics.Bitmap) h0Var.f391656d).getHeight());
        sb6.append(" width: ");
        sb6.append(((android.graphics.Bitmap) h0Var.f391656d).getWidth());
        java.lang.String sb7 = sb6.toString();
        z51.w wVar = this.f551755e;
        wVar.f(sb7);
        boolean h17 = p3325xe03a0797.p3326xc267989b.z0.h(y0Var);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!h17) {
            wVar.g("load bitmap job is cancel");
            return f0Var;
        }
        z51.r rVar = (z51.r) wVar.a(z51.r.class);
        int width = ((android.graphics.Bitmap) h0Var.f391656d).getWidth();
        int height = ((android.graphics.Bitmap) h0Var.f391656d).getHeight();
        rVar.f("onThumbShowToChangeTagViewLocation >> width: " + width + " thumbHeight: " + height);
        rVar.f551751m = height;
        rVar.f551750l = width;
        y51.f fVar = rVar.f551748j;
        if (fVar != null) {
            int c17 = fVar.c();
            rVar.f("onGetLocationCallback >> bottomHeight: " + c17);
            rVar.k(c17);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = wVar.f551761f;
        if (c21524xecd57b9a == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbView");
            throw null;
        }
        c21524xecd57b9a.m79195x464b3146(true);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a2 = wVar.f551761f;
        if (c21524xecd57b9a2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbView");
            throw null;
        }
        int width2 = ((android.graphics.Bitmap) h0Var.f391656d).getWidth();
        int height2 = ((android.graphics.Bitmap) h0Var.f391656d).getHeight();
        c21524xecd57b9a2.f279184o = width2;
        c21524xecd57b9a2.f279185p = height2;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a3 = wVar.f551761f;
        if (c21524xecd57b9a3 != null) {
            c21524xecd57b9a3.setImageBitmap((android.graphics.Bitmap) h0Var.f391656d);
            return f0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbView");
        throw null;
    }
}
