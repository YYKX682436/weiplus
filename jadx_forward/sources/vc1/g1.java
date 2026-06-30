package vc1;

/* loaded from: classes13.dex */
public class g1 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516501a;

    public g1(vc1.p1 p1Var) {
        this.f516501a = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter
    /* renamed from: getInfoWindow */
    public android.view.View mo99027xc3c42a34(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
        rl1.b bVar = null;
        if (interfaceC4409x88f1805a == null) {
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) interfaceC4409x88f1805a.mo37237xb5887064())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Map.DefaultTencentMapView", "realMarker.getTag is null, return");
            return null;
        }
        if (((java.lang.String) interfaceC4409x88f1805a.mo37237xb5887064()).endsWith("#label")) {
            return null;
        }
        vc1.o1 z17 = this.f516501a.z((java.lang.String) interfaceC4409x88f1805a.mo37237xb5887064());
        if (z17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "[getInfoWindow] appbrandMarker is null, return");
            return null;
        }
        vc1.q2 q2Var = z17.f516558b;
        if (q2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "[getInfoWindow] appBrandMarker.appBrandMarkerOptions is null, return");
            return null;
        }
        vc1.o2 o2Var = q2Var.f516681s;
        if (o2Var == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = z17;
        objArr[1] = java.lang.Boolean.valueOf(o2Var.f516584r != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "marker:%s calloutStyle.view is %b", objArr);
        if (o2Var.f516584r != null || o2Var.f516585s != null) {
            if (z17.f516565e == null) {
                z17.f516565e = new android.widget.ImageView(this.f516501a.f516593a);
            }
            android.graphics.Bitmap bitmap = o2Var.f516585s;
            if (bitmap == null) {
                bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(o2Var.f516584r);
            }
            if (bitmap == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "marker:%s calloutStyle.view exist but bitmap is null");
            }
            synchronized (this.f516501a.f516637w) {
                android.widget.ImageView imageView = z17.f516565e;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
            }
            return z17.f516565e;
        }
        vc1.p1 p1Var = this.f516501a;
        p1Var.getClass();
        java.util.LinkedList linkedList = vc1.i3.f516518b;
        synchronized (linkedList) {
            if (linkedList.size() > 0) {
                bVar = (rl1.b) linkedList.removeFirst();
                if (bVar != null && android.view.ViewGroup.class.isInstance(bVar.getParent())) {
                    ((android.view.ViewGroup) bVar.getParent()).removeView(bVar);
                }
            }
        }
        if (bVar == null) {
            bVar = new rl1.b(p1Var.f516593a);
        }
        bVar.m162687x765074af("");
        bVar.m162689x3abfd950(12);
        bVar.m162688x1c5c5ff4(rl1.b.f478688e);
        bVar.m162690x92ad6c1b(0);
        bVar.m162686xc1f6fb8c("center");
        int i17 = rl1.b.f478689f;
        rl1.b bVar2 = bVar;
        bVar2.a(0, 0, i17, i17, 0, 0, 0, 0, 0);
        bVar.m162687x765074af(o2Var.f516567a);
        bVar.m162689x3abfd950(o2Var.f516569c);
        bVar.m162688x1c5c5ff4(o2Var.f516568b);
        bVar.m162690x92ad6c1b(o2Var.f516574h);
        bVar.m162686xc1f6fb8c(o2Var.f516581o);
        bVar2.a(o2Var.f516570d, o2Var.f516571e, o2Var.f516572f, o2Var.f516573g, o2Var.f516575i, o2Var.f516577k, o2Var.f516578l, o2Var.f516576j, o2Var.f516579m);
        return bVar;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter
    /* renamed from: onInfoWindowDettached */
    public void mo99028xf6653887(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a, android.view.View view) {
        if (view instanceof rl1.b) {
            rl1.b bVar = (rl1.b) view;
            java.util.LinkedList linkedList = vc1.i3.f516518b;
            synchronized (linkedList) {
                if (linkedList.size() <= 0) {
                    linkedList.push(bVar);
                }
            }
        }
    }
}
