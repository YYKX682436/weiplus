package qb2;

/* loaded from: classes10.dex */
public class b0 extends wn.a {

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f442699e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f442700f;

    /* renamed from: g, reason: collision with root package name */
    public final int f442701g;

    /* renamed from: h, reason: collision with root package name */
    public final int f442702h;

    /* renamed from: i, reason: collision with root package name */
    public final int f442703i;

    /* renamed from: m, reason: collision with root package name */
    public final int f442704m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f442705n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f442706o;

    /* renamed from: p, reason: collision with root package name */
    public int f442707p;

    /* renamed from: q, reason: collision with root package name */
    public int f442708q;

    /* renamed from: r, reason: collision with root package name */
    public qb2.u f442709r;

    /* renamed from: s, reason: collision with root package name */
    public qb2.v f442710s;

    public b0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f442699e = fragment;
        this.f442700f = "Finder.ConversationAdapter";
        this.f442701g = 1;
        this.f442702h = 2;
        this.f442703i = 1;
        this.f442704m = 2;
        this.f442705n = new java.util.ArrayList();
        this.f442706o = new java.util.HashMap();
        this.f442707p = 1;
        this.f442708q = 2;
    }

    public static final void B(qb2.b0 b0Var, qb2.t tVar) {
        int i17;
        b0Var.getClass();
        int i18 = tVar.f65869x2262335f;
        java.util.HashMap hashMap = b0Var.f442706o;
        java.util.ArrayList arrayList = b0Var.f442705n;
        if (i18 == 1 && b0Var.f442707p == 1 && b0Var.f442708q == 2) {
            qb2.t tVar2 = (qb2.t) hashMap.get("findersayhisessionholder");
            if (tVar2 == null) {
                tVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80.f209599e.a();
                tVar2.f65866xbed8694c = "findersayhisessionholder";
                tVar2.f65868x114ef53e = "findersayhisessionholder";
                tVar2.f65860xa97e89ae = 1000L;
                tVar2.f65869x2262335f = 100;
                tVar2.f65862x29cbf907 = 2;
                android.content.Context mo7438x76847179 = b0Var.f442699e.mo7438x76847179();
                if (mo7438x76847179 == null) {
                    mo7438x76847179 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x76847179);
                tVar2.f65864x1362f030 = xy2.c.e(mo7438x76847179);
                tVar2.u0();
                hashMap.put("findersayhisessionholder", tVar2);
            }
            tVar2.f65870xa35b5abb += tVar.f65870xa35b5abb;
            tVar2.f65853xf66fcca9 = tVar.f65853xf66fcca9;
            tVar2.f65871xa783a79b = tVar.f65871xa783a79b;
            tVar2.f65861x9b4f418d = tVar.f65861x9b4f418d;
            int indexOf = arrayList.indexOf(tVar2);
            if (indexOf >= 0) {
                b0Var.p(indexOf);
                return;
            } else {
                arrayList.add(0, tVar2);
                b0Var.q(indexOf);
                return;
            }
        }
        if ((i18 != 3 && i18 != 200) || b0Var.f442707p != 1 || b0Var.f442708q != 1) {
            int c07 = kz5.n0.c0(arrayList, (qb2.t) hashMap.get(tVar.f65866xbed8694c));
            if (c07 >= 0) {
                arrayList.remove(c07);
                b0Var.w(c07);
            }
            tVar.u0();
            java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i17 = -1;
                    break;
                } else {
                    if (((qb2.t) listIterator.previous()).f65860xa97e89ae > 0) {
                        i17 = listIterator.nextIndex();
                        break;
                    }
                }
            }
            int i19 = i17 >= 0 ? i17 + 1 : 0;
            arrayList.add(i19, tVar);
            b0Var.q(i19);
            hashMap.remove(tVar.f65866xbed8694c);
            java.lang.String field_sessionId = tVar.f65866xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
            hashMap.put(field_sessionId, tVar);
            return;
        }
        qb2.t tVar3 = (qb2.t) hashMap.get("finderaliassessionholder");
        if (tVar3 == null) {
            tVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80.f209599e.a();
            tVar3.f65866xbed8694c = "finderaliassessionholder";
            tVar3.f65868x114ef53e = "finderaliassessionholder";
            tVar3.f65860xa97e89ae = 0L;
            tVar3.f65869x2262335f = 200;
            tVar3.f65862x29cbf907 = 1;
            tVar3.u0();
            hashMap.put("finderaliassessionholder", tVar3);
        }
        tVar3.f65870xa35b5abb += tVar.f65870xa35b5abb;
        tVar3.f65853xf66fcca9 = tVar.f65853xf66fcca9;
        tVar3.f65871xa783a79b = tVar.f65871xa783a79b;
        tVar3.f65861x9b4f418d = tVar.f65861x9b4f418d;
        int indexOf2 = arrayList.indexOf(tVar3);
        if (indexOf2 >= 0) {
            b0Var.p(indexOf2);
        } else {
            arrayList.add(0, tVar3);
            b0Var.q(indexOf2);
        }
    }

    public qb2.t E(int i17) {
        java.lang.Object obj = this.f442705n.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (qb2.t) obj;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public wn.j mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.afr, parent, false);
        int i18 = com.p314xaae8f345.mm.R.id.a9o;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.a9o);
        if (imageView != null) {
            i18 = com.p314xaae8f345.mm.R.id.cik;
            android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.cik);
            if (imageView2 != null) {
                i18 = com.p314xaae8f345.mm.R.id.civ;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.civ);
                if (textView != null) {
                    i18 = com.p314xaae8f345.mm.R.id.cua;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.cua);
                    if (textView2 != null) {
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
                        int i19 = com.p314xaae8f345.mm.R.id.he7;
                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.he7);
                        if (textView3 != null) {
                            i19 = com.p314xaae8f345.mm.R.id.o7m;
                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o7m);
                            if (textView4 != null) {
                                i19 = com.p314xaae8f345.mm.R.id.o_4;
                                android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o_4);
                                if (textView5 != null) {
                                    i19 = com.p314xaae8f345.mm.R.id.o_5;
                                    android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o_5);
                                    if (textView6 != null) {
                                        vb2.e eVar = new vb2.e(linearLayout, imageView, imageView2, textView, textView2, linearLayout, textView3, textView4, textView5, textView6);
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout, "getRoot(...)");
                                        wn.j jVar = new wn.j(linearLayout, eVar);
                                        android.view.View itemView = jVar.f3639x46306858;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                                        itemView.setOnLongClickListener(new qb2.y(jVar, this, itemView));
                                        itemView.setOnClickListener(new qb2.z(jVar, this, itemView));
                                        return jVar;
                                    }
                                }
                            }
                        }
                        i18 = i19;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public final void J(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        java.util.HashMap hashMap = this.f442706o;
        qb2.t tVar = (qb2.t) hashMap.get(sessionId);
        java.util.ArrayList arrayList = this.f442705n;
        int c07 = kz5.n0.c0(arrayList, tVar);
        if (c07 < 0 || c07 >= arrayList.size()) {
            return;
        }
        arrayList.remove(c07);
        hashMap.remove(sessionId);
        w(c07);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f442705n.size();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(55:44|(1:46)|47|(1:49)(1:205)|(2:50|51)|(2:53|(1:201)(7:57|58|59|60|(1:62)(1:197)|63|(2:65|(2:67|(43:69|70|(1:72)(1:195)|73|74|75|(2:187|(2:191|192)(1:190))(3:78|79|80)|81|82|83|(1:85)(1:183)|86|(1:182)(4:90|91|92|93)|94|95|(2:98|96)|99|100|(1:102)(1:177)|(2:104|(1:106)(1:165))|166|(1:168)(1:176)|(2:170|(1:172)(1:174))|175|108|(1:117)|118|(2:121|119)|122|(1:(1:164))(1:125)|(1:127)|(1:131)|132|133|134|135|136|137|138|(3:140|(1:142)(1:153)|(4:144|(2:151|152)|148|149))|154|148|149)))))(1:202)|196|70|(0)(0)|73|74|75|(0)|187|(0)|191|192|81|82|83|(0)(0)|86|(1:88)|182|94|95|(1:96)|99|100|(0)(0)|(0)|166|(0)(0)|(0)|175|108|(4:110|112|114|117)|118|(1:119)|122|(0)|(1:164)|(0)|(2:129|131)|132|133|134|135|136|137|138|(0)|154|148|149) */
    /* JADX WARN: Can't wrap try/catch for region: R(56:44|(1:46)|47|(1:49)(1:205)|50|51|(2:53|(1:201)(7:57|58|59|60|(1:62)(1:197)|63|(2:65|(2:67|(43:69|70|(1:72)(1:195)|73|74|75|(2:187|(2:191|192)(1:190))(3:78|79|80)|81|82|83|(1:85)(1:183)|86|(1:182)(4:90|91|92|93)|94|95|(2:98|96)|99|100|(1:102)(1:177)|(2:104|(1:106)(1:165))|166|(1:168)(1:176)|(2:170|(1:172)(1:174))|175|108|(1:117)|118|(2:121|119)|122|(1:(1:164))(1:125)|(1:127)|(1:131)|132|133|134|135|136|137|138|(3:140|(1:142)(1:153)|(4:144|(2:151|152)|148|149))|154|148|149)))))(1:202)|196|70|(0)(0)|73|74|75|(0)|187|(0)|191|192|81|82|83|(0)(0)|86|(1:88)|182|94|95|(1:96)|99|100|(0)(0)|(0)|166|(0)(0)|(0)|175|108|(4:110|112|114|117)|118|(1:119)|122|(0)|(1:164)|(0)|(2:129|131)|132|133|134|135|136|137|138|(0)|154|148|149) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03ce, code lost:
    
        if ((r1.length() > 0 ? r15 : false) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04aa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04ac, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03e4, code lost:
    
        if ((r0.length() > 0 ? r15 : false) != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04b0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04b4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03c5 A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:83:0x0319, B:85:0x0321, B:86:0x0352, B:93:0x0361, B:94:0x0396, B:98:0x03ae, B:100:0x03b4, B:104:0x03c5, B:108:0x03eb, B:110:0x03f7, B:112:0x03fd, B:114:0x0403, B:117:0x040b, B:118:0x040e, B:121:0x0418, B:125:0x0428, B:127:0x045d, B:131:0x047c, B:132:0x0493, B:164:0x0444, B:166:0x03d0, B:170:0x03db, B:175:0x03e6, B:182:0x038e, B:183:0x0345), top: B:82:0x0319 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0418 A[Catch: Exception -> 0x04b0, LOOP:1: B:119:0x0414->B:121:0x0418, LOOP_END, TryCatch #0 {Exception -> 0x04b0, blocks: (B:83:0x0319, B:85:0x0321, B:86:0x0352, B:93:0x0361, B:94:0x0396, B:98:0x03ae, B:100:0x03b4, B:104:0x03c5, B:108:0x03eb, B:110:0x03f7, B:112:0x03fd, B:114:0x0403, B:117:0x040b, B:118:0x040e, B:121:0x0418, B:125:0x0428, B:127:0x045d, B:131:0x047c, B:132:0x0493, B:164:0x0444, B:166:0x03d0, B:170:0x03db, B:175:0x03e6, B:182:0x038e, B:183:0x0345), top: B:82:0x0319 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x045d A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:83:0x0319, B:85:0x0321, B:86:0x0352, B:93:0x0361, B:94:0x0396, B:98:0x03ae, B:100:0x03b4, B:104:0x03c5, B:108:0x03eb, B:110:0x03f7, B:112:0x03fd, B:114:0x0403, B:117:0x040b, B:118:0x040e, B:121:0x0418, B:125:0x0428, B:127:0x045d, B:131:0x047c, B:132:0x0493, B:164:0x0444, B:166:0x03d0, B:170:0x03db, B:175:0x03e6, B:182:0x038e, B:183:0x0345), top: B:82:0x0319 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03db A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:83:0x0319, B:85:0x0321, B:86:0x0352, B:93:0x0361, B:94:0x0396, B:98:0x03ae, B:100:0x03b4, B:104:0x03c5, B:108:0x03eb, B:110:0x03f7, B:112:0x03fd, B:114:0x0403, B:117:0x040b, B:118:0x040e, B:121:0x0418, B:125:0x0428, B:127:0x045d, B:131:0x047c, B:132:0x0493, B:164:0x0444, B:166:0x03d0, B:170:0x03db, B:175:0x03e6, B:182:0x038e, B:183:0x0345), top: B:82:0x0319 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0345 A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:83:0x0319, B:85:0x0321, B:86:0x0352, B:93:0x0361, B:94:0x0396, B:98:0x03ae, B:100:0x03b4, B:104:0x03c5, B:108:0x03eb, B:110:0x03f7, B:112:0x03fd, B:114:0x0403, B:117:0x040b, B:118:0x040e, B:121:0x0418, B:125:0x0428, B:127:0x045d, B:131:0x047c, B:132:0x0493, B:164:0x0444, B:166:0x03d0, B:170:0x03db, B:175:0x03e6, B:182:0x038e, B:183:0x0345), top: B:82:0x0319 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0321 A[Catch: Exception -> 0x04b0, TryCatch #0 {Exception -> 0x04b0, blocks: (B:83:0x0319, B:85:0x0321, B:86:0x0352, B:93:0x0361, B:94:0x0396, B:98:0x03ae, B:100:0x03b4, B:104:0x03c5, B:108:0x03eb, B:110:0x03f7, B:112:0x03fd, B:114:0x0403, B:117:0x040b, B:118:0x040e, B:121:0x0418, B:125:0x0428, B:127:0x045d, B:131:0x047c, B:132:0x0493, B:164:0x0444, B:166:0x03d0, B:170:0x03db, B:175:0x03e6, B:182:0x038e, B:183:0x0345), top: B:82:0x0319 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03ae A[Catch: Exception -> 0x04b0, LOOP:0: B:96:0x03aa->B:98:0x03ae, LOOP_END, TRY_ENTER, TryCatch #0 {Exception -> 0x04b0, blocks: (B:83:0x0319, B:85:0x0321, B:86:0x0352, B:93:0x0361, B:94:0x0396, B:98:0x03ae, B:100:0x03b4, B:104:0x03c5, B:108:0x03eb, B:110:0x03f7, B:112:0x03fd, B:114:0x0403, B:117:0x040b, B:118:0x040e, B:121:0x0418, B:125:0x0428, B:127:0x045d, B:131:0x047c, B:132:0x0493, B:164:0x0444, B:166:0x03d0, B:170:0x03db, B:175:0x03e6, B:182:0x038e, B:183:0x0345), top: B:82:0x0319 }] */
    /* JADX WARN: Type inference failed for: r18v12, types: [com.tencent.mm.feature.finder.live.v4] */
    /* JADX WARN: Type inference failed for: r18v13, types: [ya2.m1, zy2.tb] */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r29, int r30) {
        /*
            Method dump skipped, instructions count: 1331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qb2.b0.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // wn.a
    public java.util.List x() {
        return this.f442705n;
    }

    @Override // wn.a
    public void y(boolean z17, java.util.List convs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convs, "convs");
        pm0.v.X(new qb2.a0(this, convs, z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209339l9).mo141623x754a37bb()).r()).booleanValue() || this.f442707p == 2) {
            ((ku5.t0) ku5.t0.f394148d).q(new qb2.w(convs));
        }
    }

    @Override // wn.a
    public boolean z(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object obj;
        if (str == null || w0Var == null) {
            return false;
        }
        java.lang.Object obj2 = w0Var.f398509d;
        boolean z17 = obj2 instanceof qb2.t;
        java.lang.String str2 = this.f442700f;
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversation");
            qb2.t tVar = (qb2.t) obj2;
            if (tVar.f65862x29cbf907 != this.f442708q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "conv.field_scene:" + tVar.f65862x29cbf907 + " != conveScene:" + this.f442708q);
                return false;
            }
            pm0.v.X(new qb2.x(this, w0Var));
        } else {
            if (!(obj2 instanceof java.lang.String)) {
                return false;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            if (!(((java.lang.String) obj2).length() > 0)) {
                return false;
            }
            java.lang.Object obj3 = w0Var.f398509d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str3 = (java.lang.String) obj3;
            java.util.ArrayList arrayList = this.f442705n;
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                qb2.t tVar2 = (qb2.t) next;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = tVar2.D1;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z3Var != null ? z3Var.d1() : null, str3) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar2.f65868x114ef53e, str3)) {
                    obj = next;
                    break;
                }
            }
            qb2.t tVar3 = (qb2.t) obj;
            if (tVar3 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[onContactStorageChange] username=".concat(str3));
                tVar3.u0();
                int indexOf = arrayList.indexOf(tVar3);
                if (indexOf >= 0 && indexOf < arrayList.size()) {
                    p(indexOf);
                }
            }
        }
        return true;
    }
}
