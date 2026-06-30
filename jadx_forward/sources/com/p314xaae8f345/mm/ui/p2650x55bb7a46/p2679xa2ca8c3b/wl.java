package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class wl extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f287483s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 f287484t;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570060w1);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vl vlVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vl(this);
        vlVar.a(xgVar);
        xgVar.setTag(vlVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        menuItem.getItemId();
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        g4Var.c(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d(), 100, 0, this.f287483s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String U1 = f9Var.U1();
        ot0.q v17 = ot0.q.v(U1);
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemHardDeviceMsg", "onItemClick, content is null.");
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430207k)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", v17.f430207k);
            j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            return true;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430224o0)) {
            if (!(java.lang.System.currentTimeMillis() - (((long) v17.D0) * 1000) >= 2592000000L)) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_rank_info", U1);
                intent2.putExtra("key_rank_title", v17.f430268z0);
                intent2.putExtra("key_champion_info", v17.A0);
                intent2.putExtra("key_champion_coverimg", v17.A0);
                intent2.putExtra("rank_id", v17.f430224o0);
                intent2.putExtra("app_username", v17.H);
                intent2.putExtra("device_type", v17.C0);
                intent2.putExtra("key_champioin_username", v17.f430264y0);
                j45.l.j(dVar.g(), "exdevice", ".ui.ExdeviceRankInfoUI", intent2, null);
                ve4.g.a(28);
                return true;
            }
        }
        j45.l.h(dVar.g(), "exdevice", ".ui.ExdeviceExpireUI");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0028 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d0(int r5, java.lang.String r6) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L17
            long r0 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Exception -> Lb
            goto L1a
        Lb:
            r0 = move-exception
            java.lang.String r1 = "isOverDue:%s,%s"
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6}
            java.lang.String r0 = "MicroMsg.ChattingItemHardDeviceMsg"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1, r6)
        L17:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
        L1a:
            long r5 = (long) r5
            r2 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r2
            long r0 = r0 * r2
            long r5 = r5 + r0
            long r0 = c01.id.a()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wl.d0(int, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f4  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 r27, yb5.d r28, rd5.d r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wl.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
