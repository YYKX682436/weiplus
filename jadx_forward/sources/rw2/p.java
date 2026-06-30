package rw2;

/* loaded from: classes10.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.t f482153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(rw2.t tVar) {
        super(0);
        this.f482153d = tVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba c22965x6f780cba = new com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba();
        rw2.t tVar = this.f482153d;
        tVar.f482167k = c22965x6f780cba;
        c22965x6f780cba.c();
        tVar.f482167k.g(0, 0, tVar.f482157a, tVar.f482158b);
        tVar.f482167k.g(0, 0, tVar.f482157a, tVar.f482158b);
        com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba c22965x6f780cba2 = tVar.f482167k;
        int i17 = tVar.f482157a;
        int i18 = tVar.f482158b;
        c22965x6f780cba2.f296332c = i17;
        c22965x6f780cba2.f296333d = i18;
        is0.c cVar = new is0.c(true, 15L);
        android.opengl.GLES20.glBindTexture(3553, cVar.f375928e);
        android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, tVar.f482157a, tVar.f482158b, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        android.opengl.GLES20.glBindTexture(3553, 0);
        tVar.f482169m = cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.f482159c, "initVLogDirector finished size:[" + tVar.f482157a + ',' + tVar.f482158b + ']');
        return jz5.f0.f384359a;
    }
}
