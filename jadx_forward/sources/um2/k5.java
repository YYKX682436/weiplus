package um2;

/* loaded from: classes3.dex */
public final class k5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f510390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f510391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f510392g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(um2.x5 x5Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17, boolean z17) {
        super(0);
        this.f510389d = x5Var;
        this.f510390e = h0Var;
        this.f510391f = i17;
        this.f510392g = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap;
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        co0.s m129740xd052bc21;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zn m57678xf4613059;
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap2;
        zi2.w wVar;
        android.view.ViewGroup viewGroup;
        ((ku5.t0) ku5.t0.f394148d).h(dk2.lg.f315270d, "Finder.LiveExceptionMonitor");
        fm2.c cVar = this.f510389d.f101139c;
        mm2.h hVar = null;
        if (cVar == null || (m57678xf4613059 = cVar.m57678xf4613059()) == null || (imageView = m57678xf4613059.f202117d) == null) {
            bitmap = null;
        } else {
            um2.x5 x5Var = this.f510389d;
            if (!((mm2.e1) x5Var.c(mm2.e1.class)).g7() || (wVar = x5Var.I0) == null || (viewGroup = wVar.f446856d) == null) {
                bitmap2 = null;
            } else {
                int width = viewGroup.getWidth();
                int height = viewGroup.getHeight();
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/fluent/ViewFluentPerformerKt", "getDrawBitmap", "(Landroid/view/View;Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                bitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, bitmap2, "com/tencent/mm/ui/fluent/ViewFluentPerformerKt", "getDrawBitmap", "(Landroid/view/View;Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap2, "createBitmap(...)");
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap2);
                imageView.draw(canvas);
                viewGroup.draw(canvas);
            }
            bitmap = bitmap2;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        efVar.N();
        fm2.c cVar2 = this.f510389d.f101139c;
        if (cVar2 != null && (m129740xd052bc21 = cVar2.m129740xd052bc21()) != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f510389d.f101138b;
            java.lang.Boolean bool = (java.lang.Boolean) this.f510390e.f391656d;
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            int i17 = this.f510391f;
            android.graphics.Bitmap bitmap3 = ((mm2.c1) this.f510389d.c(mm2.c1.class)).I4;
            boolean z17 = this.f510392g;
            mm2.w wVar2 = (mm2.w) this.f510389d.c(mm2.w.class);
            mm2.f fVar = (mm2.f) wVar2.f411036o.mo3195x754a37bb();
            if (fVar == mm2.f.f410549g || fVar == mm2.f.f410550h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", "getLivingVideoViewToMiniWindow state:" + fVar + " videoView:" + wVar2.f411037p);
                mm2.h hVar2 = wVar2.f411037p;
                if (hVar2 != null) {
                    hVar2.m147953xfc7b4f0e(new mm2.m(wVar2));
                }
                mm2.h hVar3 = wVar2.f411037p;
                if (hVar3 != null) {
                    hVar3.m147949xed92507e(new mm2.n(wVar2));
                }
                mm2.h hVar4 = wVar2.f411037p;
                if (hVar4 != null) {
                    hVar4.m147952x1aa44e73(new mm2.o(wVar2));
                }
                mm2.h hVar5 = wVar2.f411037p;
                if (hVar5 != null) {
                    hVar5.m147949xed92507e(null);
                }
                mm2.h hVar6 = wVar2.f411037p;
                if (hVar6 != null) {
                    hVar6.m147948x6d4d6833(null);
                }
                hVar = wVar2.f411037p;
            }
            m129740xd052bc21.G(new jn0.a(activityC0065xcd7aa112, booleanValue, false, i17, 0, bitmap3, z17, hVar, false, bitmap, false, 1296, null));
        }
        fm2.c cVar3 = this.f510389d.f101139c;
        if (cVar3 != null && (m57663xfb7e5820 = cVar3.m57663xfb7e5820()) != null && (c14197x319b1b9e = m57663xfb7e5820.f390664f) != null) {
            if2.z.f372686a.b(c14197x319b1b9e);
        }
        if (pm0.v.z(((mm2.c1) this.f510389d.c(mm2.c1.class)).f410340g2, 524288)) {
            efVar.Z();
        }
        efVar.R();
        ((mm2.e5) this.f510389d.c(mm2.e5.class)).O6();
        return jz5.f0.f384359a;
    }
}
