package ff4;

/* loaded from: classes4.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff4.m f343226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.b50 f343227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ff4.k f343228f;

    public i(ff4.m mVar, r45.b50 b50Var, ff4.k kVar) {
        this.f343226d = mVar;
        this.f343227e = b50Var;
        this.f343228f = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        java.util.Iterator it;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.b50 item = this.f343227e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
        this.f343226d.getClass();
        ff4.k h17 = this.f343228f;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStorySync", "processStoryVisit username:" + str + " createTime:" + i17 + " id:" + j17 + " ulonglong " + pm0.v.u(j17));
            gf4.l.f352887d.c(hf6Var2);
            it = ff4.m.f343236h.iterator();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StoryCgi.NetSceneStorySync", "StorySyncMsg parse error:  " + e17.getMessage());
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
