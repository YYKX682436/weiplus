package com.tencent.mm.plugin.finder.activity.poi.flutter;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lia2/o0;", "Lzy2/q9;", "Lgx2/b;", "<init>", "()V", "ia2/b", "ia2/e", "ia2/f", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes2.dex */
public final class FinderFlutterPOIActivity extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements ia2.o0, zy2.q9, gx2.b {
    public static final /* synthetic */ int H1 = 0;
    public boolean A;
    public double A1;
    public int B;
    public java.lang.String B1;
    public boolean C;
    public java.lang.String C1;
    public boolean D;
    public java.lang.String D1;
    public boolean E;
    public java.lang.Integer E1;
    public boolean F;
    public int G;
    public boolean G1;
    public long H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public gx2.q f101776J;
    public android.view.View K;
    public boolean L;
    public yz5.l M;
    public yz5.p N;
    public yz5.p P;
    public yz5.q Q;
    public yz5.a R;
    public yz5.a S;
    public yz5.a T;
    public yz5.a U;
    public boolean V;
    public boolean W;
    public boolean Y;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f101777l1;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.v90 f101778p0;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.ref.WeakReference f101780t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.ref.WeakReference f101781u;

    /* renamed from: v, reason: collision with root package name */
    public ia2.n0 f101782v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f101783w;

    /* renamed from: x, reason: collision with root package name */
    public r45.f96 f101784x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f101785x0;

    /* renamed from: x1, reason: collision with root package name */
    public kotlinx.coroutines.r2 f101786x1;

    /* renamed from: y, reason: collision with root package name */
    public r45.c35 f101787y;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f101788y0;

    /* renamed from: y1, reason: collision with root package name */
    public kotlinx.coroutines.r2 f101789y1;

    /* renamed from: z, reason: collision with root package name */
    public bw5.ah0 f101790z;

    /* renamed from: z1, reason: collision with root package name */
    public double f101791z1;
    public final ja2.c X = new ja2.c();
    public zy2.o9 Z = zy2.o9.f477518f;

    /* renamed from: p1, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f101779p1 = kotlinx.coroutines.z0.b();
    public final int F1 = 2000;

    public static final void c7(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity) {
        r45.f96 f96Var = finderFlutterPOIActivity.f101784x;
        if (f96Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "skip requesting poi stream since location is empty");
            return;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(finderFlutterPOIActivity);
        int intExtra = finderFlutterPOIActivity.getIntent().getIntExtra("KEY_ENTER_MEDIA_TAB_TYPE", 0);
        java.lang.String stringExtra = finderFlutterPOIActivity.getIntent().getStringExtra("key_bypass_buffer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str = stringExtra;
        ia2.n0 n0Var = finderFlutterPOIActivity.f101782v;
        if (n0Var != null) {
            n0Var.h(f96Var, finderFlutterPOIActivity.Z, finderFlutterPOIActivity.H, java.lang.Integer.valueOf(finderFlutterPOIActivity.I), intExtra, str, new ia2.h(weakReference), new ia2.i(weakReference));
        }
    }

    public static final boolean d7(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity) {
        yz5.a aVar = finderFlutterPOIActivity.U;
        if (aVar != null) {
            return ((java.lang.Boolean) aVar.invoke()).booleanValue();
        }
        return false;
    }

    public static final com.tencent.mm.plugin.location.model.LocationInfo e7(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity) {
        yz5.a aVar = finderFlutterPOIActivity.T;
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = aVar != null ? (com.tencent.mm.plugin.location.model.LocationInfo) aVar.invoke() : null;
        if (locationInfo == null) {
            r45.f96 f96Var = finderFlutterPOIActivity.f101784x;
            return f96Var != null ? ia2.e0.b(f96Var, false, 1, null) : null;
        }
        if (locationInfo.f144594p != null) {
            return locationInfo;
        }
        r45.f96 f96Var2 = finderFlutterPOIActivity.f101784x;
        if ((f96Var2 != null ? f96Var2.getString(5) : null) == null) {
            return locationInfo;
        }
        r45.f96 f96Var3 = finderFlutterPOIActivity.f101784x;
        locationInfo.f144594p = f96Var3 != null ? f96Var3.getString(5) : null;
        return locationInfo;
    }

    public static final void f7(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity) {
        ia2.n0 n0Var;
        com.tencent.pigeon.finder.POIFlutterAPI pOIFlutterAPI;
        ia2.n0 n0Var2;
        com.tencent.pigeon.finder.POIFlutterAPI pOIFlutterAPI2;
        byte[] p76 = finderFlutterPOIActivity.p7();
        if (p76 != null && (n0Var2 = finderFlutterPOIActivity.f101782v) != null && (pOIFlutterAPI2 = n0Var2.f289955f) != null) {
            pOIFlutterAPI2.reloadHeadWithInfo(p76, ia2.q0.a("reloadHeadWithInfo"));
        }
        bw5.ah0 ah0Var = finderFlutterPOIActivity.f101790z;
        byte[] byteArray = ah0Var != null ? ah0Var.toByteArray() : null;
        if (byteArray == null || (n0Var = finderFlutterPOIActivity.f101782v) == null || (pOIFlutterAPI = n0Var.f289955f) == null) {
            return;
        }
        pOIFlutterAPI.reloadHeadWithServiceInfo(byteArray, ia2.q0.a("reloadHeadWithServiceInfo"));
    }

    public static final java.lang.Object g7(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        yz5.a aVar = finderFlutterPOIActivity.S;
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = aVar != null ? (com.tencent.mm.plugin.location.model.LocationInfo) aVar.invoke() : null;
        if (locationInfo != null) {
            if (!locationInfo.a()) {
                locationInfo = null;
            }
            if (locationInfo != null) {
                return locationInfo;
            }
        }
        return kotlinx.coroutines.a4.c(1000L, new ia2.a0(context, null), continuation);
    }

    public static final void h7(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity, float f17, boolean z17, boolean z18) {
        ia2.n0 n0Var;
        com.tencent.pigeon.finder.POIFlutterAPI pOIFlutterAPI;
        if (finderFlutterPOIActivity.L && z17) {
            finderFlutterPOIActivity.L = false;
        }
        if (finderFlutterPOIActivity.D || finderFlutterPOIActivity.L) {
            f17 = 1.0f;
        }
        if (z18 || (n0Var = finderFlutterPOIActivity.f101782v) == null || (pOIFlutterAPI = n0Var.f289955f) == null) {
            return;
        }
        pOIFlutterAPI.updateScrollState(f17, ia2.q0.a("updateScrollState"));
    }

    public static void m7(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity, androidx.fragment.app.FragmentActivity fragmentActivity, com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment, gx2.q qVar, android.view.ViewGroup viewGroup, java.lang.Integer num, java.lang.Integer num2, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            qVar = null;
        }
        if ((i18 & 8) != 0) {
            viewGroup = null;
        }
        if ((i18 & 16) != 0) {
            num = null;
        }
        if ((i18 & 32) != 0) {
            num2 = 0;
        }
        if ((i18 & 64) != 0) {
            i17 = 0;
        }
        finderFlutterPOIActivity.getClass();
        finderFlutterPOIActivity.f101780t = new java.lang.ref.WeakReference(vASCommonFragment);
        finderFlutterPOIActivity.f101781u = new java.lang.ref.WeakReference(fragmentActivity);
        finderFlutterPOIActivity.D1 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        finderFlutterPOIActivity.E1 = num2;
        finderFlutterPOIActivity.G = i17;
        if (fragmentActivity instanceof androidx.appcompat.app.AppCompatActivity) {
            androidx.appcompat.app.AppCompatActivity activity = (androidx.appcompat.app.AppCompatActivity) fragmentActivity;
            kotlin.jvm.internal.o.g(activity, "activity");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(activity).c(zy2.ra.class))).V6();
            finderFlutterPOIActivity.B1 = V6.getString(1);
            finderFlutterPOIActivity.C1 = V6.getString(2);
        }
        if (qVar != null) {
            finderFlutterPOIActivity.f101776J = qVar;
        } else if (viewGroup != null && num != null) {
            float j76 = finderFlutterPOIActivity.j7(fragmentActivity);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "expand :" + j76);
            gx2.a aVar = new gx2.a();
            aVar.f277337c = j76;
            aVar.f277336b = true;
            aVar.f277339e = new hx2.c(viewGroup);
            android.view.View findViewById = fragmentActivity.findViewById(num.intValue());
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            finderFlutterPOIActivity.f101776J = aVar.b((android.view.ViewGroup) findViewById);
        }
        gx2.q qVar2 = finderFlutterPOIActivity.f101776J;
        if (qVar2 != null) {
            ((java.util.ArrayList) qVar2.U).add(finderFlutterPOIActivity);
        }
        gx2.q qVar3 = finderFlutterPOIActivity.f101776J;
        if (qVar3 != null) {
            qVar3.setHeaderComponent(new hx2.g(fragmentActivity, com.tencent.mm.R.color.f478494f, com.tencent.mm.R.color.BW_93, com.tencent.mm.R.drawable.aar, false, true));
        }
        gx2.q qVar4 = finderFlutterPOIActivity.f101776J;
        if (qVar4 != null) {
            qVar4.setBackgroundComponent(new ia2.b(finderFlutterPOIActivity, fragmentActivity));
        }
        gx2.q qVar5 = finderFlutterPOIActivity.f101776J;
        if (qVar5 != null) {
            ia2.f fVar = new ia2.f(finderFlutterPOIActivity);
            fVar.f285656a = qVar5;
            ((java.util.HashSet) qVar5.R).add(fVar);
        }
        gx2.q qVar6 = finderFlutterPOIActivity.f101776J;
        if (qVar6 != null) {
            qVar6.setContentReachTop(new ia2.o(finderFlutterPOIActivity));
        }
        gx2.q qVar7 = finderFlutterPOIActivity.f101776J;
        if (qVar7 == null) {
            return;
        }
        qVar7.setOnInterceptScroll(new ia2.p(finderFlutterPOIActivity));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r0.f289957h == true) goto L8;
     */
    @Override // gx2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Rect G6(gx2.q r5) {
        /*
            r4 = this;
            java.lang.String r0 = "drawer"
            kotlin.jvm.internal.o.g(r5, r0)
            ia2.n0 r0 = r4.f101782v
            r1 = 0
            if (r0 == 0) goto L10
            boolean r0 = r0.f289957h
            r2 = 1
            if (r0 != r2) goto L10
            goto L11
        L10:
            r2 = r1
        L11:
            if (r2 == 0) goto L2a
            androidx.appcompat.app.AppCompatActivity r0 = r4.getContext()
            com.tencent.mm.ui.ah r0 = com.tencent.mm.ui.bh.a(r0)
            android.graphics.Rect r2 = new android.graphics.Rect
            float r5 = r5.getTranslation()
            int r5 = (int) r5
            int r3 = r0.f197135a
            int r0 = r0.f197136b
            r2.<init>(r1, r5, r3, r0)
            return r2
        L2a:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.G6(gx2.q):android.graphics.Rect");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        android.content.Intent intent = getIntent();
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("key_from_type") : null;
        zy2.o9 o9Var = serializableExtra instanceof zy2.o9 ? (zy2.o9) serializableExtra : null;
        java.io.Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("key_half_screen_mode") : null;
        la2.a aVar = serializableExtra2 instanceof la2.a ? (la2.a) serializableExtra2 : null;
        if (o9Var == zy2.o9.f477516d) {
            return 81;
        }
        return aVar == la2.a.f317501e ? 303 : 26;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dqk;
    }

    public final java.lang.String i7(boolean z17) {
        java.lang.String string;
        int i17;
        int d17 = getD();
        cl0.g gVar = new cl0.g();
        long j17 = this.H;
        java.lang.String str = "";
        gVar.h("source_feedid", j17 != 0 ? pm0.v.u(j17) : "");
        if (!z17 || (i17 = this.I) == 0) {
            gVar.o("comment_scene", d17);
        } else {
            gVar.o("comment_scene", i17);
        }
        gVar.o("ref_commentscene", this.I);
        r45.f96 f96Var = this.f101784x;
        if (f96Var != null && (string = f96Var.getString(5)) != null) {
            str = string;
        }
        gVar.h("poiid", str);
        gVar.o("is_pre_load", this.f101785x0 ? 1 : 0);
        java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(this.H, null, this.I);
        if (this.B1 == null || this.C1 == null) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(context).c(zy2.ra.class))).V6();
            java.lang.String str2 = this.B1;
            if (str2 == null) {
                str2 = V6.getString(1);
            }
            this.B1 = str2;
            java.lang.String str3 = this.C1;
            if (str3 == null) {
                str3 = V6.getString(2);
            }
            this.C1 = str3;
        }
        gVar.h("finder_context_id", this.B1);
        gVar.h("finder_tab_context_id", this.C1);
        gVar.h("source_session_buffer", ek6);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return gVar2;
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        return this.f101783w;
    }

    public final float j7(android.content.Context context) {
        int i17;
        if (!this.C) {
            double d17 = this.A1;
            return d17 <= 0.0d ? ym5.x.a(context, 233.0f) : ((float) d17) + ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 28.0f);
        }
        int h17 = com.tencent.mm.ui.bl.h(context);
        int c17 = com.tencent.mm.ui.bl.c(context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        float f17 = i17;
        float a17 = (f17 - h17) - ym5.x.a(context, 44.0f);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "expandContentHeightPx=" + a17 + " realHeight " + f17 + " statusBarSize " + h17);
        return a17;
    }

    public final java.lang.String k7() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("favpoi_");
        r45.f96 f96Var = this.f101784x;
        sb6.append(f96Var != null ? f96Var.getString(5) : null);
        java.lang.String sb7 = sb6.toString();
        r45.f96 f96Var2 = this.f101784x;
        java.lang.String string = f96Var2 != null ? f96Var2.getString(5) : null;
        if (!(string == null || string.length() == 0)) {
            return sb7;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sb7);
        r45.f96 f96Var3 = this.f101784x;
        if (f96Var3 == null || (str = f96Var3.getString(3)) == null) {
            str = "";
        }
        sb8.append(str);
        java.lang.String sb9 = sb8.toString();
        java.lang.String stringExtra = getIntent().getStringExtra("kRemark");
        if (stringExtra == null) {
            return sb9;
        }
        return sb9 + stringExtra;
    }

    public final void l7() {
        if (this.f101782v == null) {
            return;
        }
        if (this.D) {
            q7(true);
            return;
        }
        com.tencent.pigeon.finder.POIFlutterDataReport o76 = o7();
        if (o76 != null) {
            o76.onScreenAppear(ia2.q0.a("onScreenAppear"));
        }
    }

    public void n7(java.lang.String eventId, java.util.Map paramMap) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(paramMap, "paramMap");
        cl0.g gVar = new cl0.g();
        for (java.util.Map.Entry entry : paramMap.entrySet()) {
            gVar.h((java.lang.String) entry.getKey(), entry.getValue());
        }
        com.tencent.pigeon.finder.POIFlutterDataReport o76 = o7();
        if (o76 != null) {
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            o76.reportPOIDetailPageCustomEvent(eventId, gVar2, ia2.s.f289977d);
        }
    }

    public final com.tencent.pigeon.finder.POIFlutterDataReport o7() {
        ia2.n0 n0Var = this.f101782v;
        com.tencent.pigeon.finder.POIFlutterDataReport pOIFlutterDataReport = n0Var != null ? n0Var.f289956g : null;
        if (pOIFlutterDataReport == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FinderFlutterPOIActivity", "requireDataReportAPI: null");
                throw new java.lang.RuntimeException("requireDataReportAPI: null");
            }
        }
        return pOIFlutterDataReport;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x031a  */
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.view.ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        ia2.n0 n0Var = this.f101782v;
        if (n0Var != null) {
            java.util.Iterator it = ((java.util.LinkedHashMap) n0Var.f289962p).entrySet().iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader) ((java.util.Map.Entry) it.next()).getValue()).unregisterFetchDoneListener(n0Var.f289968v);
            }
        }
        this.f101776J = null;
        ((y80.y0) ((z80.k0) i95.n0.c(z80.k0.class))).wi(false);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.rl7);
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f101788y0);
        }
        this.f101788y0 = null;
        this.f101783w = true;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f101782v == null) {
            return;
        }
        if (this.D) {
            q7(false);
            return;
        }
        com.tencent.pigeon.finder.POIFlutterDataReport o76 = o7();
        if (o76 != null) {
            o76.onScreenDisappear(ia2.q0.a("onScreenDisappear"));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        l7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        android.view.ViewTreeObserver viewTreeObserver;
        super.onStart();
        if (this.f101788y0 == null) {
            this.f101788y0 = new ia2.n(this);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.rl7);
            if (viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(this.f101788y0);
        }
    }

    public final byte[] p7() {
        java.lang.String str;
        r45.c35 c35Var = this.f101787y;
        if (c35Var != null) {
            r45.f96 f96Var = this.f101784x;
            if (f96Var == null || (str = f96Var.getString(5)) == null) {
                str = "";
            }
            c35Var.set(0, str);
        }
        r45.c35 c35Var2 = this.f101787y;
        if (c35Var2 != null) {
            r45.f96 f96Var2 = this.f101784x;
            c35Var2.set(11, java.lang.Float.valueOf(f96Var2 != null ? f96Var2.getFloat(1) : 0.0f));
        }
        r45.c35 c35Var3 = this.f101787y;
        if (c35Var3 != null) {
            r45.f96 f96Var3 = this.f101784x;
            c35Var3.set(12, java.lang.Float.valueOf(f96Var3 != null ? f96Var3.getFloat(0) : 0.0f));
        }
        r45.c35 c35Var4 = this.f101787y;
        if (c35Var4 != null) {
            return c35Var4.toByteArray();
        }
        return null;
    }

    public final void q7(boolean z17) {
        if (this.Y == z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "setIsExpand: " + z17);
        this.Y = z17;
        com.tencent.pigeon.finder.POIFlutterDataReport o76 = o7();
        if (o76 != null) {
            o76.setIsExpanded(z17, ia2.q0.a("setIsExpand"));
        }
    }
}
