package rr2;

/* loaded from: classes2.dex */
public final class a implements com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23903xf979ab8a, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f480701d;

    public a(yz5.l onSelectLbsCb) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSelectLbsCb, "onSelectLbsCb");
        this.f480701d = onSelectLbsCb;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23903xf979ab8a.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23903xf979ab8a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23903xf979ab8a.Companion.m88544x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPoiLbsPlugin", "[onAttachedToEngine]");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23903xf979ab8a.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23903xf979ab8a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23903xf979ab8a.Companion.m88544x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPoiLbsPlugin", "[onDetachedFromEngine]");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23903xf979ab8a
    /* renamed from: onSelectLbs */
    public void mo88542x97e24002(byte[] lbs, java.lang.String city) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lbs, "lbs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(city, "city");
        bw5.wj wjVar = new bw5.wj();
        wjVar.mo11468x92b714fd(lbs);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onSelectLbs] ");
        boolean[] zArr = wjVar.f116284p;
        sb6.append(zArr[2] ? wjVar.f116276e : "");
        sb6.append(" city:");
        sb6.append(city);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPoiLbsPlugin", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = zArr[2] ? wjVar.f116276e : "";
        if (!(str == null || str.length() == 0)) {
            intent.putExtra("get_poi_classify_type", wjVar.f116280i);
            intent.putExtra("get_poi_address", zArr[4] ? wjVar.f116278g : "");
            intent.putExtra("get_poi_classify_id", zArr[1] ? wjVar.f116275d : "");
            intent.putExtra("get_poi_name", zArr[2] ? wjVar.f116276e : "");
            intent.putExtra("get_city", city);
        }
        this.f480701d.mo146xb9724478(intent);
    }
}
