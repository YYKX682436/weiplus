package cp5;

/* loaded from: classes14.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f302675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp5.j f302676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z17, cp5.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f302675d = z17;
        this.f302676e = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cp5.g(this.f302675d, this.f302676e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cp5.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dp5.c cVar = dp5.c.f323811a;
        dp5.b bVar = (dp5.b) dp5.c.f323812b;
        bVar.getClass();
        if (this.f302675d) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            android.opengl.GLES20.glBindTexture(3553, iArr[0]);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9728);
            android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
            android.opengl.GLES20.glBindTexture(3553, 0);
            bVar.b("genTexture");
            i17 = iArr[0];
        } else {
            int[] iArr2 = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr2, 0);
            android.opengl.GLES20.glBindTexture(36197, iArr2[0]);
            android.opengl.GLES20.glTexParameteri(36197, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(36197, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729);
            android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
            android.opengl.GLES20.glBindTexture(36197, 0);
            bVar.b("glGenTextures");
            i17 = iArr2[0];
        }
        dp5.a aVar2 = new dp5.a(i17);
        this.f302676e.f302694f.add(aVar2);
        return aVar2;
    }
}
