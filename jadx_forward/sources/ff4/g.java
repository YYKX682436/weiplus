package ff4;

/* loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff4.m f343220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.b50 f343221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ff4.k f343222f;

    public g(ff4.m mVar, r45.b50 b50Var, ff4.k kVar) {
        this.f343220d = mVar;
        this.f343221e = b50Var;
        this.f343222f = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        java.util.Iterator it;
        java.util.LinkedList linkedList;
        r45.xe6 xe6Var;
        java.util.LinkedList linkedList2;
        r45.xe6 xe6Var2;
        java.util.LinkedList linkedList3;
        r45.xe6 xe6Var3;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.b50 item = this.f343221e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
        this.f343220d.getClass();
        ff4.k h17 = this.f343222f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h17, "h");
        try {
            r45.hf6 hf6Var = new r45.hf6();
            r45.cu5 cu5Var = item.f452064e;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = hf6Var.mo11468x92b714fd((cu5Var == null || (gVar = cu5Var.f453374f) == null) ? null : gVar.g());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncMsg");
            r45.hf6 hf6Var2 = (r45.hf6) mo11468x92b714fd;
            r45.if6 if6Var = hf6Var2.f457655f;
            java.lang.String str = if6Var.f458529e;
            int i17 = if6Var.f458535n;
            long j17 = hf6Var2.f457653d;
            ef4.d0 d0Var = ef4.e0.f333974a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            d0Var.e(str, j17, i17, null, true);
            nf4.j b17 = d0Var.b(str);
            r45.lf6 y07 = b17.y0();
            r45.oe6 oe6Var = y07.f460965h;
            java.lang.String str2 = (oe6Var == null || (linkedList3 = oe6Var.f463738e) == null || (xe6Var3 = (r45.xe6) kz5.n0.a0(linkedList3, 0)) == null) ? null : xe6Var3.f471558h;
            r45.oe6 oe6Var2 = y07.f460965h;
            java.lang.String str3 = (oe6Var2 == null || (linkedList2 = oe6Var2.f463738e) == null || (xe6Var2 = (r45.xe6) kz5.n0.a0(linkedList2, 0)) == null) ? null : xe6Var2.f471556f;
            r45.oe6 oe6Var3 = y07.f460965h;
            ef4.a0.f333968a.a(str, b17.f69410x443468b, b17.f69403xac3be4e, str2, str3, ((oe6Var3 == null || (linkedList = oe6Var3.f463738e) == null || (xe6Var = (r45.xe6) kz5.n0.a0(linkedList, 0)) == null) ? 0.0f : xe6Var.f471573z) * 1000);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStorySync", "processStoryPostDel username:" + str + " createTime:" + i17 + " id:" + j17 + " lastCreateTime:" + b17.f69403xac3be4e + " lastId:" + b17.f69410x443468b + "   ulonglong " + pm0.v.u(j17));
            it = ff4.m.f343236h.iterator();
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StoryCgi.NetSceneStorySync", "StorySyncMsg parse error!");
            z17 = false;
        }
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
        h17.mo50305x3d8a09a2(0);
        z17 = true;
        if (z17) {
            return;
        }
        h17.mo50305x3d8a09a2(0);
    }
}
