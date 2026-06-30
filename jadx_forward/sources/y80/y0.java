package y80;

@j95.b
/* loaded from: classes8.dex */
public final class y0 extends i95.w implements z80.k0 {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f541494f;

    /* renamed from: d, reason: collision with root package name */
    public final int f541492d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f541493e = "MicroMsg.NavigationJump3rdAppLogicService";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f541495g = "";

    public final int Ai() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_poi_navigation_list_style, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f541493e, "map list style config: " + Ni);
        return Ni;
    }

    public final java.util.Map Bi(java.util.Map map) {
        return kz5.c1.m(kz5.b1.e(new jz5.l("click_navigation_sid", this.f541495g)), map);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Di(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -103524794: goto L29;
                case 40719148: goto L1e;
                case 744792033: goto L13;
                case 1254578009: goto L8;
                default: goto L7;
            }
        L7:
            goto L34
        L8:
            java.lang.String r0 = "com.autonavi.minimap"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L11
            goto L34
        L11:
            r2 = 3
            goto L35
        L13:
            java.lang.String r0 = "com.baidu.BaiduMap"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L34
        L1c:
            r2 = 4
            goto L35
        L1e:
            java.lang.String r0 = "com.google.android.apps.maps"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L27
            goto L34
        L27:
            r2 = 2
            goto L35
        L29:
            java.lang.String r0 = "com.tencent.map"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L32
            goto L34
        L32:
            r2 = 1
            goto L35
        L34:
            r2 = 0
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.y0.Di(java.lang.String):int");
    }

    public final boolean Ni(java.util.Map map) {
        boolean containsKey = map.containsKey("com.tencent.map");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f541493e, "install tencent map: %s.", java.lang.Boolean.valueOf(containsKey));
        return containsKey;
    }

    public final void Ri(java.lang.String str, boolean z17, java.util.Map map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("is_installation", java.lang.Integer.valueOf(z17 ? 1 : 0));
        linkedHashMap.put("navigation_software_id", java.lang.Integer.valueOf(Di(str)));
        linkedHashMap.toString();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50243, "click_the_navigation_software", Bi(linkedHashMap), 34048);
    }

    public final void Ui(android.content.Context context, db5.g4 g4Var, z80.p0 p0Var, int i17, java.lang.StringBuilder sb6) {
        if (p0Var.f552190c == -1) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_enable_open_poi_to_device, 0) != 1) {
                return;
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
        am.b6 b6Var = c5348xb8e1a564.f135674g;
        b6Var.f87752a = p0Var.f552190c;
        b6Var.f87753b = p0Var.f552191d;
        b6Var.f87755d = 48;
        c5348xb8e1a564.e();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ExDeviceHaveBindNetworkDeviceEvent: ");
        am.c6 c6Var = c5348xb8e1a564.f135675h;
        sb7.append(c6Var.f87869a);
        sb7.append(", deviceMenuItemId=");
        sb7.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f541493e, sb7.toString());
        if (c6Var.f87869a) {
            g4Var.g(i17, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bry), 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 3, sb6.toString(), "");
    }

    public void wi(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeListenTencentMapDownloadPageEvent: ");
        sb6.append(z17);
        sb6.append(", ");
        sb6.append(this.f541494f != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f541493e, sb6.toString());
        if (!z17) {
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f541494f;
            if (abstractC20980x9b9ad01d != null) {
                abstractC20980x9b9ad01d.mo48814x2efc64();
            }
            this.f541494f = null;
            return;
        }
        if (this.f541494f == null) {
            final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5308x8211822d> abstractC20980x9b9ad01d2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5308x8211822d>(a0Var) { // from class: com.tencent.mm.feature.location.NavigationJump3rdAppLogicService$changeListenTencentMapDownloadPageEvent$1
                {
                    this.f39173x3fe91575 = 556451357;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5308x8211822d c5308x8211822d) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5308x8211822d event = c5308x8211822d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    am.g4 g4Var = event.f135627g;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g4Var.f88271b, "mmdownloadapp_JjNedmtv7FDUquSYR5")) {
                        return true;
                    }
                    y80.y0 y0Var = y80.y0.this;
                    y0Var.getClass();
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    int i17 = g4Var.f88270a;
                    if (i17 >= 0) {
                        linkedHashMap.put("navigation_button_click", java.lang.Integer.valueOf(i17));
                    }
                    java.lang.String str = g4Var.f88270a == -1 ? "page_in" : "click_navigation_page";
                    dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                    iy1.c cVar = iy1.c.MainUI;
                    ((cy1.a) rVar).Gj(50244, str, y0Var.Bi(linkedHashMap), 34048);
                    return true;
                }
            };
            this.f541494f = abstractC20980x9b9ad01d2;
            abstractC20980x9b9ad01d2.mo48813x58998cd();
        }
    }
}
