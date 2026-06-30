package f22;

/* loaded from: classes13.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f340493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f22.a f340494e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, f22.a aVar) {
        super(1);
        this.f340493d = context;
        this.f340494e = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.v75 v75Var = (r45.v75) obj;
        if (v75Var != null) {
            boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
            boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v75Var.f469500g);
            f22.a aVar = this.f340494e;
            boolean z18 = z17 && n17 && !aVar.f445576w;
            android.content.Context context = this.f340493d;
            if (z18) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", v75Var.f469500g);
                boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v75Var.f469500g, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(context));
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(14, 2, b17 ? 33 : 32, intent);
                intent.putExtra("KEY_FINDER_SELF_FLAG", b17);
                if (aVar.f445579z || aVar.f445578y) {
                    intent.putExtra("key_enter_profile_tab", 10);
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put("emoticonEnterScene", java.lang.Integer.valueOf(aVar.f445688a));
                linkedHashMap.put("needJumpToSingleEmoji", java.lang.Boolean.valueOf(aVar.f445578y));
                linkedHashMap.put("sdkRequestID", aVar.c());
                linkedHashMap.put("enterHasRedDot", java.lang.Integer.valueOf(aVar.A));
                intent.putExtra("key_biz_passthrough_info", new cl0.g(linkedHashMap).toString());
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1.f542005a.w(context, intent);
            } else {
                qk.w wVar = new qk.w(v75Var);
                java.lang.String str = aVar.f445561h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                wVar.f445585g = str;
                wVar.f445688a = aVar.f445688a;
                java.lang.String str2 = aVar.f445562i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
                wVar.f445586h = str2;
                java.lang.String str3 = aVar.f445570q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
                wVar.f445587i = str3;
                java.lang.String str4 = aVar.f445571r;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str4, "<set-?>");
                wVar.f445588j = str4;
                java.lang.String str5 = aVar.f445572s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
                wVar.f445589k = str5;
                java.lang.String str6 = aVar.f445573t;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str6, "<set-?>");
                wVar.f445590l = str6;
                java.lang.String str7 = aVar.f445570q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str7, "<set-?>");
                wVar.f445587i = str7;
                wVar.f445593o = aVar.f445578y;
                wVar.f445689b = aVar.f445689b;
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
                if (p6Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StoreEmoticonDesignerProfileJumpLogic", "unable to get emoticon liteapp feature service");
                } else {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(context, wVar);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
