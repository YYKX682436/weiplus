package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class im extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.axx;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String headUrl;
        java.lang.String nickname;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo;
        java.lang.String str;
        java.lang.String str2;
        so2.q2 item = (so2.q2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bind view ");
        cm2.a aVar = cm2.a.f43328a;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = item.f410549n;
        sb6.append(aVar.x(finderObject, i17));
        com.tencent.mars.xlog.Log.i("FinderLivePurchaseListConvert", sb6.toString());
        android.view.View p17 = holder.p(com.tencent.mm.R.id.lyb);
        java.lang.String n27 = item.n2();
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (p17 != null) {
            g1Var.f().c(new mn2.q3(n27, com.tencent.mm.plugin.finder.storage.y90.f128356f), (com.tencent.mm.ui.widget.MMRoundCornerImageView) p17, g1Var.h(mn2.f1.f329953d));
        }
        vo0.d a17 = g1Var.a();
        ya2.g gVar = ya2.h.f460484a;
        ya2.b2 b17 = gVar.b(finderObject.getUsername());
        jz5.f0 f0Var = null;
        if (b17 != null) {
            headUrl = b17.y0();
        } else {
            com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
            headUrl = contact != null ? contact.getHeadUrl() : null;
            if (headUrl == null) {
                headUrl = "";
            }
        }
        mn2.n nVar = new mn2.n(headUrl, null, 2, null);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.lyf);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p18, g1Var.h(mn2.f1.f329957h));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.lyz);
        ya2.b2 b18 = gVar.b(finderObject.getUsername());
        if (b18 != null) {
            nickname = b18.z0();
        } else {
            com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderObject.getContact();
            nickname = contact2 != null ? contact2.getNickname() : null;
            if (nickname == null) {
                nickname = "";
            }
        }
        textView.setText(nickname);
        android.view.View p19 = holder.p(com.tencent.mm.R.id.lye);
        kotlin.jvm.internal.o.f(p19, "getView(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) p19;
        ya2.b2 b19 = gVar.b(finderObject.getUsername());
        if (b19 == null || (authInfo = b19.field_authInfo) == null) {
            com.tencent.mm.protocal.protobuf.FinderContact contact3 = finderObject.getContact();
            authInfo = contact3 != null ? contact3.getAuthInfo() : null;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1.f460511a.c(imageView, authInfo, 0);
        android.view.View p27 = holder.p(com.tencent.mm.R.id.lys);
        kotlin.jvm.internal.o.f(p27, "getView(...)");
        android.widget.TextView textView2 = (android.widget.TextView) p27;
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        java.lang.String string = liveInfo != null ? liveInfo.getString(49) : null;
        if (string == null) {
            string = "";
        }
        textView2.setText(string);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        java.lang.String description = objectDesc != null ? objectDesc.getDescription() : null;
        if (description == null) {
            description = "";
        }
        if (description.length() == 0) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.lyd)).setVisibility(8);
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.lyd)).setText("");
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.lyd)).setVisibility(0);
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.lyd)).setText(description);
        }
        r45.nw1 liveInfo2 = finderObject.getLiveInfo();
        if (liveInfo2 != null) {
            int integer = liveInfo2.getInteger(4);
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.lyj);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            long j17 = integer * 1000;
            java.util.Map map = com.tencent.mm.plugin.finder.assist.w2.f102643a;
            java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
            if (j17 < 3600000) {
                str2 = "";
            } else {
                long timeInMillis = gregorianCalendar.getTimeInMillis();
                java.util.HashMap hashMap = com.tencent.mm.plugin.finder.assist.w2.f102644b;
                boolean containsKey = hashMap.containsKey(java.lang.Long.valueOf(j17));
                java.util.HashMap hashMap2 = com.tencent.mm.plugin.finder.assist.w2.f102645c;
                if (containsKey) {
                    if (timeInMillis - ((java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17))).longValue() >= 60000) {
                        hashMap.remove(java.lang.Long.valueOf(j17));
                    } else if (hashMap2.containsKey(java.lang.Long.valueOf(j17))) {
                        str2 = (java.lang.String) hashMap2.get(java.lang.Long.valueOf(j17));
                    }
                }
                long j18 = timeInMillis - j17;
                long j19 = j18 / 3600000;
                if (j19 == 0) {
                    int i19 = (int) (j18 / 60000);
                    java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.f87, java.lang.Integer.valueOf(i19 >= 1 ? i19 : 1));
                    hashMap2.put(java.lang.Long.valueOf(j17), string2);
                    hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
                    textView3 = textView3;
                    str2 = string2;
                } else {
                    java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
                    long timeInMillis2 = j17 - gregorianCalendar2.getTimeInMillis();
                    if (timeInMillis2 < 0 || timeInMillis2 >= 86400000) {
                        long timeInMillis3 = (j17 - gregorianCalendar2.getTimeInMillis()) + 86400000;
                        if (timeInMillis3 <= 0 || timeInMillis3 >= 86400000) {
                            long timeInMillis4 = j17 - (gregorianCalendar2.getTimeInMillis() - 172800000);
                            if (timeInMillis4 < 0 || timeInMillis4 >= 86400000) {
                                java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar();
                                gregorianCalendar3.setTimeInMillis(j17);
                                if (gregorianCalendar.get(1) == gregorianCalendar3.get(1)) {
                                    str = "" + ((java.lang.Object) android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.f492138fc5, " "), j17));
                                    hashMap2.put(java.lang.Long.valueOf(j17), str);
                                    hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
                                } else {
                                    str = "" + ((java.lang.Object) android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.fcl), j17));
                                    hashMap2.put(java.lang.Long.valueOf(j17), str);
                                    hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
                                }
                            } else {
                                str = context.getString(com.tencent.mm.R.string.f492141fd2) + " " + k35.m1.d(context.getString(com.tencent.mm.R.string.fcv), j17 / 1000);
                                hashMap2.put(java.lang.Long.valueOf(j17), str);
                                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
                            }
                        } else {
                            str = context.getString(com.tencent.mm.R.string.fdi) + " " + k35.m1.d(context.getString(com.tencent.mm.R.string.fcv), j17 / 1000);
                            hashMap2.put(java.lang.Long.valueOf(j17), str);
                            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
                        }
                    } else {
                        int i27 = (int) j19;
                        str = context.getResources().getString(com.tencent.mm.R.string.f86, java.lang.Integer.valueOf(i27 < 1 ? 1 : i27));
                        hashMap2.put(java.lang.Long.valueOf(j17), str);
                        hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
                    }
                    textView3 = textView3;
                    str2 = str;
                }
            }
            textView3.setText(str2);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.lyj)).setText("");
        }
        android.view.View p28 = holder.p(com.tencent.mm.R.id.lyz);
        kotlin.jvm.internal.o.f(p28, "getView(...)");
        android.widget.TextView textView4 = (android.widget.TextView) p28;
        android.view.View p29 = holder.p(com.tencent.mm.R.id.lye);
        kotlin.jvm.internal.o.f(p29, "getView(...)");
        android.view.View p37 = holder.p(com.tencent.mm.R.id.lys);
        kotlin.jvm.internal.o.f(p37, "getView(...)");
        textView4.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.convert.hm(textView4, p29, this, (android.widget.TextView) p37));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) holder.p(com.tencent.mm.R.id.lyz)).getPaint(), 0.8f);
    }
}
