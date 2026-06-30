package sv2;

/* loaded from: classes10.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sv2.f f494802a;

    public e(sv2.f fVar) {
        this.f494802a = fVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        java.lang.String str = fVar.f152150c;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
        sv2.f fVar2 = this.f494802a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = fVar2.f494807n;
        c14994x9b99c079.m59432x8c9240d6("doAdDraftPostSceneEnd");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.pp2) resp).m75936x14adae67(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("svrFinderObj id:");
        sb6.append(pm0.v.u(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L));
        sb6.append(", localId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = fVar2.f494804h;
        sb6.append(x80Var.f66236x88be67a1);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = fVar2.f494806m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        if (c19792x256d2725 != null && (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "full_cover_url:" + c19788xd7cfd73e.m76593x1b8bd82d() + " full_cover_url_token:" + c19788xd7cfd73e.m76594x3e755f67());
        }
        java.util.concurrent.CountDownLatch countDownLatch = fVar2.f494809p;
        if (i17 == 0 && i18 == 0 && c19792x256d2725 != null) {
            fVar2.f494808o = new sv2.b(x80Var);
            countDownLatch.countDown();
            ov2.e.i(fVar2, "andr_Cgi_Draft_Suc", fVar2.f494807n, 0, null, 12, null);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
            long j17 = x80Var.f66236x88be67a1;
            am.ga gaVar = c5442xd807898f.f135783g;
            gaVar.f88282a = j17;
            gaVar.f88283b = 100;
            gaVar.f88284c = 2;
            c5442xd807898f.e();
        } else {
            fVar2.f494808o = new sv2.a(x80Var, i17, i18, str == null ? "" : str);
            countDownLatch.countDown();
            fVar2.h("andr_Cgi_Draft_Fail", c14994x9b99c079, i18, str);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
            long j18 = x80Var.f66236x88be67a1;
            am.ga gaVar2 = c5442xd807898f2.f135783g;
            gaVar2.f88282a = j18;
            gaVar2.f88283b = 100;
            gaVar2.f88284c = 3;
            c5442xd807898f2.e();
        }
        return jz5.f0.f384359a;
    }
}
