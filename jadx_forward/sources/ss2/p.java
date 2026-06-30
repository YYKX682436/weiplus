package ss2;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f493506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ss2.a0 f493507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ss2.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f493507e = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ss2.p(this.f493507e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ss2.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f493506d;
        ss2.a0 a0Var = this.f493507e;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qc0.c1 c1Var = (qc0.c1) i95.n0.c(qc0.c1.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = a0Var.f493438d;
            boolean z17 = a0Var.d() == 1;
            a0Var.getClass();
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d Bi = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Bi();
            java.lang.String Zi = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Zi();
            java.lang.String l17 = mv2.q.f413151a.l(Zi, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostMediaWidget", "record video path:%s thumb path:%s", Zi, l17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.g(Zi, l17, Bi, Bi.f152728h * 1000, 11);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            g17.f237216u = bool;
            g17.M.putBoolean("key_edit_enable_emoji_search", true);
            ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsRecordVideoCompositionProvider", "com.tencent.mm.feature.sns.SnsFeatureService");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.a.f246359a.d(g17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsRecordVideoCompositionProvider", "com.tencent.mm.feature.sns.SnsFeatureService");
            com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
            java.util.HashMap hashMap = (java.util.HashMap) c10402x5bc41468.f146312h;
            hashMap.put("plugin_filter", bool);
            hashMap.put("plugin_tip", bool);
            hashMap.put("plugin_poi", bool);
            hashMap.put("plugin_menu", bool);
            g17.f237210o = c10402x5bc41468;
            g17.f237215t = java.lang.Boolean.valueOf(z17);
            this.f493506d = 1;
            obj = ((pc0.e2) c1Var).wi(abstractActivityC21394xb3d2c0cf, g17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        qc0.m1 m1Var = (qc0.m1) obj;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (m1Var != null && (i17 = m1Var.f442944b) == -1 && m1Var.f442945c == 0) {
            qc0.l1 a17 = m1Var.a();
            android.content.Intent intent = new android.content.Intent();
            if (m1Var.f442948f != null && a17 != null && (str = a17.f442929b) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                arrayList.add(str);
                if (a17.a()) {
                    intent.putExtra("key_select_image_list", arrayList);
                } else {
                    intent.putExtra("key_select_video_list", arrayList);
                    intent.putExtra("video_thumb_path", a17.f442930c);
                }
                a0Var.f493438d.m78606xf64f9fe4(4387, i17, intent);
            }
        }
        return f0Var;
    }
}
