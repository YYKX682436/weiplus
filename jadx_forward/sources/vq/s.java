package vq;

/* loaded from: classes9.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f520752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520753g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str, java.lang.String str2, long j17, com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f520750d = str;
        this.f520751e = str2;
        this.f520752f = j17;
        this.f520753g = emojiDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.util.Iterator it;
        int intValue;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = this.f520750d;
        sb6.append(str2);
        sb6.append("FileContent");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.vfs.w6.h(sb7);
        com.p314xaae8f345.mm.vfs.w6.h(str2);
        com.p314xaae8f345.mm.vfs.w6.e(sb7);
        com.p314xaae8f345.mm.vfs.w6.e(str2);
        int i17 = 0;
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(this.f520751e, false);
        com.p314xaae8f345.mm.p2614xca6eae71.g0 g0Var = new com.p314xaae8f345.mm.p2614xca6eae71.g0();
        java.util.LinkedList linkedList = g0Var.f274789d;
        java.util.LinkedList linkedList2 = g0Var.f274790e;
        java.util.LinkedList linkedList3 = g0Var.f274791f;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        boolean z17 = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d;
        java.util.LinkedList<com.p314xaae8f345.mm.p2614xca6eae71.a2> softbankEmojiItems = com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a.f274874a.f274790e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(softbankEmojiItems, "softbankEmojiItems");
        for (com.p314xaae8f345.mm.p2614xca6eae71.a2 a2Var : softbankEmojiItems) {
            boolean z18 = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d;
            java.util.LinkedList linkedList4 = ((com.p314xaae8f345.mm.p2614xca6eae71.c) com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a.f274874a.f274789d.get(a2Var.f274748e)).f274756d;
            java.lang.Object obj = linkedList4.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            java.lang.String hexString = java.lang.Integer.toHexString(((java.lang.Number) obj).intValue());
            if (linkedList4.size() >= 2) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(hexString);
                sb8.append('-');
                java.lang.Object obj2 = linkedList4.get(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                sb8.append(java.lang.Integer.toHexString(((java.lang.Number) obj2).intValue()));
                hexString = sb8.toString();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hexString);
            java.lang.String hexString2 = java.lang.Integer.toHexString(a2Var.f274747d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hexString2, "toHexString(...)");
            linkedHashMap.put(hexString, hexString2);
            i17 = 0;
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        boolean z19 = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d;
        java.util.LinkedList nameIdxEmojiItems = com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a.f274874a.f274791f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(nameIdxEmojiItems, "nameIdxEmojiItems");
        java.util.Iterator it6 = nameIdxEmojiItems.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p2614xca6eae71.f1 f1Var = (com.p314xaae8f345.mm.p2614xca6eae71.f1) it6.next();
            boolean z27 = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d;
            java.util.LinkedList linkedList5 = ((com.p314xaae8f345.mm.p2614xca6eae71.c) com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a.f274874a.f274789d.get(f1Var.f274785e)).f274756d;
            java.lang.Object obj3 = linkedList5.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            java.lang.String hexString3 = java.lang.Integer.toHexString(((java.lang.Number) obj3).intValue());
            java.util.Iterator it7 = it6;
            if (linkedList5.size() >= 2) {
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(hexString3);
                sb9.append('-');
                java.lang.Object obj4 = linkedList5.get(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
                sb9.append(java.lang.Integer.toHexString(((java.lang.Number) obj4).intValue()));
                hexString3 = sb9.toString();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hexString3);
            linkedHashMap2.put(hexString3, java.lang.Integer.valueOf(f1Var.f274784d));
            it6 = it7;
        }
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f520753g;
        if (s17 != null) {
            java.util.Iterator it8 = s17.iterator();
            int i18 = 0;
            int i19 = 0;
            while (it8.hasNext()) {
                java.lang.Object next = it8.next();
                int i27 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) next;
                java.lang.String name = x1Var.f294765b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "");
                java.lang.String str3 = x1Var.f294764a;
                if (b17) {
                    str = str2;
                    it = it8;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(emojiDebugUI.d, "skip srcFile index: " + i18);
                } else {
                    str = str2;
                    it = it8;
                    com.p314xaae8f345.mm.vfs.w6.a(sb7, com.p314xaae8f345.mm.vfs.w6.N(str3, 0, -1));
                }
                com.p314xaae8f345.mm.p2614xca6eae71.c cVar = new com.p314xaae8f345.mm.p2614xca6eae71.c();
                java.lang.String str4 = sb7;
                com.p314xaae8f345.mm.p2614xca6eae71.g0 g0Var2 = g0Var;
                java.util.LinkedList linkedList6 = linkedList;
                java.util.Iterator it9 = r26.n0.e0(r26.i0.t(r26.i0.t(name, ".wxam", "", false), ".png", "", false), new char[]{'-'}, false, 0, 6, null).iterator();
                int i28 = 0;
                while (it9.hasNext()) {
                    java.lang.Object next2 = it9.next();
                    int i29 = i28 + 1;
                    if (i28 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.util.Iterator it10 = it9;
                    int parseInt = java.lang.Integer.parseInt((java.lang.String) next2, 16);
                    if (parseInt != 65039 || (i28 == 0 && parseInt == 65039)) {
                        cVar.f274756d.add(java.lang.Integer.valueOf(parseInt));
                    }
                    i28 = i29;
                    it9 = it10;
                }
                com.p314xaae8f345.mm.p2614xca6eae71.g1 g1Var = new com.p314xaae8f345.mm.p2614xca6eae71.g1();
                g1Var.f274793e = (int) com.p314xaae8f345.mm.vfs.w6.k(str3);
                g1Var.f274792d = i19;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(emojiDebugUI.d, i18 + " , startPos:" + g1Var.f274792d + " , size:" + g1Var.f274793e);
                int i37 = g1Var.f274793e;
                i19 += i37;
                android.graphics.Bitmap m43679x46823488 = com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.INSTANCE.m43679x46823488(com.p314xaae8f345.mm.vfs.w6.N(str3, 0, i37));
                if (m43679x46823488 != null) {
                    m43679x46823488.setDensity(240);
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), m43679x46823488);
                    g1Var.f274794f = bitmapDrawable.getIntrinsicWidth();
                    g1Var.f274795g = bitmapDrawable.getIntrinsicHeight();
                }
                cVar.f274757e = g1Var;
                java.lang.String t17 = r26.i0.t(r26.i0.t(r26.i0.t(name, ".wxam", "", false), ".png", "", false), "-fe0f", "", false);
                if (linkedHashMap.containsKey(t17)) {
                    com.p314xaae8f345.mm.p2614xca6eae71.a2 a2Var2 = new com.p314xaae8f345.mm.p2614xca6eae71.a2();
                    java.lang.String str5 = (java.lang.String) linkedHashMap.get(t17);
                    if (str5 != null) {
                        if (str5.length() > 0) {
                            a2Var2.f274748e = i18;
                            a2Var2.f274747d = java.lang.Integer.parseInt(str5, 16);
                            linkedList2.add(a2Var2);
                        }
                    }
                }
                if (linkedHashMap2.containsKey(t17) && (intValue = ((java.lang.Number) linkedHashMap2.getOrDefault(t17, -1)).intValue()) != -1) {
                    com.p314xaae8f345.mm.p2614xca6eae71.f1 f1Var2 = new com.p314xaae8f345.mm.p2614xca6eae71.f1();
                    f1Var2.f274785e = i18;
                    f1Var2.f274784d = intValue;
                    linkedList3.add(f1Var2);
                }
                linkedList6.add(cVar);
                linkedList = linkedList6;
                i18 = i27;
                it8 = it;
                str2 = str;
                sb7 = str4;
                g0Var = g0Var2;
            }
        }
        java.lang.String str6 = sb7;
        java.lang.String str7 = str2;
        com.p314xaae8f345.mm.p2614xca6eae71.g0 g0Var3 = g0Var;
        byte[] mo14344x5f01b1f6 = g0Var3.mo14344x5f01b1f6();
        long j17 = this.f520752f;
        if (j17 == -1) {
            j17 = java.lang.System.currentTimeMillis() * 1000;
        }
        java.io.OutputStream K = com.p314xaae8f345.mm.vfs.w6.K(str7, false);
        try {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(K);
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeLong(j17);
                dataOutputStream.writeInt(mo14344x5f01b1f6.length);
                dataOutputStream.write(mo14344x5f01b1f6);
                dataOutputStream.write(com.p314xaae8f345.mm.vfs.w6.N(str6, 0, -1));
                vz5.b.a(dataOutputStream, null);
                vz5.b.a(K, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(emojiDebugUI.d, "new emoji:emojiVersion=" + j17 + " ,result emojiItems.size=" + g0Var3.f274789d.size() + ", softbankItems.size=" + g0Var3.f274790e.size() + ", nameIdxEmojiItems.size=" + g0Var3.f274791f.size());
                pm0.v.X(new vq.r(emojiDebugUI));
                return jz5.f0.f384359a;
            } finally {
            }
        } finally {
        }
    }
}
