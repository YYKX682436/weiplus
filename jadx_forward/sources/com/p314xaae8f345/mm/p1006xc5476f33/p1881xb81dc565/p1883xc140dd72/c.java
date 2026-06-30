package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 f231047a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f231048b = new java.util.concurrent.ConcurrentHashMap();

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var) {
        this.f231047a = null;
        this.f231047a = v0Var;
    }

    public final com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a a(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var) {
        com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a = new com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a();
        c11142xe8e5c41a.f153140e = "" + c0Var.f231051b;
        java.lang.String str = c0Var.f231053d;
        c11142xe8e5c41a.f153141f = str;
        java.lang.String str2 = c0Var.f231055f;
        c11142xe8e5c41a.f153143h = str2 != null ? str2 : "";
        c11142xe8e5c41a.f153139d = str;
        java.util.ArrayList arrayList = c0Var.f231054e;
        if (arrayList != null && arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w) it.next();
                com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 c11143x170c3f54 = new com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54();
                c11143x170c3f54.f153145d = wVar.f231375c;
                c11143x170c3f54.f153146e = wVar.f231376d;
                c11143x170c3f54.f153148g = 0;
                c11143x170c3f54.f153147f = 20;
                int i17 = wVar.f231377e;
                if (i17 == 1) {
                    c11143x170c3f54.f153147f = 10;
                }
                if (i17 == 2 || i17 == 3) {
                    c11143x170c3f54.f153147f = 1;
                }
                c11143x170c3f54.f153149h = (int) 0;
                c11142xe8e5c41a.f153144i.add(c11143x170c3f54);
            }
        }
        return c11142xe8e5c41a;
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.d(this, c0Var));
    }

    public void c(int i17, java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m(this, i17, str, bArr));
    }

    public void d(r45.k07 k07Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onMultiTalkBannerChange:%s, status:%d, banner seq:%d", k07Var.f459809d, java.lang.Integer.valueOf(k07Var.f459814i), java.lang.Long.valueOf(k07Var.f459813h));
        java.lang.String str = k07Var.f459809d;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            int i17 = 2;
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(2, null);
            if (str2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILink2MtCallBack", "userName is null");
                return;
            }
            java.lang.String str3 = k07Var.f459815m;
            p21.j y07 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ni().y0(str);
            boolean z17 = false;
            boolean z18 = y07 != null;
            int i18 = k07Var.f459814i;
            if (i18 != 0 && y07 != null) {
                long j17 = y07.f66523xadd3a154;
                if (j17 != 0) {
                    long j18 = k07Var.f459810e;
                    if (j18 != j17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "Ignore a banner msg that roomid not mathced wxgroupid %s roomid %d cached roomid %d", str, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(y07.f66523xadd3a154));
                        return;
                    }
                    i17 = 2;
                }
            }
            if (i18 == i17 && !z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "Ignore a banner msg change without banner wxgroupid %s roomid %d seq %d", str, java.lang.Long.valueOf(k07Var.f459810e), java.lang.Long.valueOf(k07Var.f459813h));
                return;
            }
            java.util.Map map = this.f231048b;
            try {
                if (!((java.util.concurrent.ConcurrentHashMap) map).containsKey(str) || k07Var.f459813h >= ((java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) map).get(str)).longValue()) {
                    ((java.util.concurrent.ConcurrentHashMap) map).put(str, java.lang.Long.valueOf(k07Var.f459813h));
                } else {
                    int i19 = k07Var.f459814i;
                    if (i19 == 2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "Ignore a banner msg that expired wxgroupid %s roomid %d seq %d cached seq %d", str, java.lang.Long.valueOf(k07Var.f459810e), java.lang.Long.valueOf(k07Var.f459813h), ((java.util.concurrent.ConcurrentHashMap) map).get(str));
                        return;
                    } else if (i19 == 1 && map != null && ((java.util.concurrent.ConcurrentHashMap) map).size() > 0) {
                        ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "remove bannerMsgTimeMap success at begin");
                    }
                }
                if ((k07Var.f459814i == 0 || k07Var.f459812g.size() < 2) && z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "get WxVoiceBannerEnd,dismiss bar!");
                    java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().f231443h;
                    if (linkedList != null) {
                        z17 = linkedList.contains(str);
                    }
                    if (!z17 && com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().Ai().contains(str) && com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().Th(str, str2)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().i(str);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().k(str, java.lang.String.valueOf(k07Var.f459810e));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
                    Ri.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "removeCurrentMTSDKMode groupid:%s", str);
                    java.util.HashMap hashMap = Ri.W;
                    if (hashMap != null && hashMap.containsKey(str)) {
                        hashMap.remove(str);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().J4(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.d2 Vi = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi();
                    java.util.LinkedList linkedList2 = Vi.f231443h;
                    if (linkedList2 == null) {
                        Vi.f231443h = new java.util.LinkedList();
                    } else {
                        linkedList2.remove(str);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().Ai().remove(str);
                    if (map == null || ((java.util.concurrent.ConcurrentHashMap) map).size() <= 0) {
                        return;
                    }
                    ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "remove bannerMsgTimeMap success at end");
                    return;
                }
                int i27 = k07Var.f459814i;
                if (i27 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "The count of banner member is %d, groupid[%s]", java.lang.Integer.valueOf(k07Var.f459812g.size()), str);
                    java.util.Iterator it = k07Var.f459812g.iterator();
                    boolean z19 = false;
                    java.lang.String str4 = "";
                    while (it.hasNext()) {
                        r45.z07 z07Var = (r45.z07) it.next();
                        if (z07Var.f473109d.f472222d.equals(str2)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "Somebody invite me! username[%s]", "");
                            z19 = true;
                        } else {
                            str4 = str4 + z07Var.f473109d.f472222d + ",";
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "memberUserNames :" + str4);
                    if (z19) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().Ai().contains(str);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.d2 Vi2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi();
                        java.util.LinkedList linkedList3 = Vi2.f231443h;
                        if (linkedList3 == null) {
                            Vi2.f231443h = new java.util.LinkedList();
                        } else {
                            linkedList3.remove(str);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().Ai().remove(str);
                    }
                    if (!z18) {
                        if (str2.equals(str3)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().l(str, str3, false, false);
                        } else if (z19) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().l(str, str3, false, false);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().l(str, str3, true, false);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().Ni(str, k07Var);
                    return;
                }
                if (i27 == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "WxVoiceBannerMemChange!2,member size : " + k07Var.f459812g.size());
                    java.util.Iterator it6 = k07Var.f459812g.iterator();
                    boolean z27 = false;
                    java.lang.String str5 = "";
                    while (it6.hasNext()) {
                        r45.z07 z07Var2 = (r45.z07) it6.next();
                        if (z07Var2.f473109d.f472222d.equals(str2)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "Somebody invite me! username[%s]", "");
                            z27 = true;
                        } else {
                            str5 = str5 + z07Var2.f473109d.f472222d + ",";
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "memberUserNames :" + str5);
                    if (z27) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().Ai().contains(str);
                    } else {
                        java.util.LinkedList linkedList4 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().f231443h;
                        if (!(linkedList4 == null ? false : linkedList4.contains(str)) && com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().Ai().contains(str) && com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().Th(str, str2)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().i(str);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.d2 Vi3 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi();
                        java.util.LinkedList linkedList5 = Vi3.f231443h;
                        if (linkedList5 == null) {
                            Vi3.f231443h = new java.util.LinkedList();
                        } else {
                            linkedList5.remove(str);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().Ai().remove(str);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "WxVoiceBannerMemChange setWxUinAndUsrName:");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().Ri(str, k07Var);
                }
            } catch (java.lang.Exception e17) {
                e = e17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILink2MtCallBack", "parse  bannerinfo  failure! xml" + e.toString());
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }

    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var, java.util.LinkedList linkedList) {
        if (this.f231047a != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (linkedList != null && linkedList.size() > 0) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.o70 o70Var = (r45.o70) it.next();
                    java.lang.String d17 = c0Var.d(o70Var.f463533d);
                    if (d17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onVideoGroupMemberChange: mid:%d NOT exist!!!", java.lang.Integer.valueOf(o70Var.f463533d));
                    } else {
                        com.p314xaae8f345.mm.p960xd6a841b0.C11145xd1f31e9e c11145xd1f31e9e = new com.p314xaae8f345.mm.p960xd6a841b0.C11145xd1f31e9e();
                        int i17 = o70Var.f463533d;
                        c11145xd1f31e9e.f153151d = i17;
                        c11145xd1f31e9e.f153153f = i17;
                        c11145xd1f31e9e.f153154g = 1;
                        int i18 = o70Var.f463534e;
                        if ((i18 & 2) != 0) {
                            c11145xd1f31e9e.f153154g = 3;
                        }
                        c11145xd1f31e9e.f153152e = d17;
                        c11145xd1f31e9e.f153155h = 100;
                        if ((i18 & 4) != 0) {
                            c11145xd1f31e9e.f153155h = 101;
                        } else if ((i18 & 8) != 0) {
                            c11145xd1f31e9e.f153155h = 102;
                        } else {
                            c11145xd1f31e9e.f153155h = 104;
                        }
                        arrayList.add(c11145xd1f31e9e);
                        c0Var.g(o70Var.f463533d, c11145xd1f31e9e.f153155h);
                    }
                }
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.f(this, arrayList));
        }
    }

    public void f(java.util.LinkedList linkedList) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = (java.lang.String) linkedList.getFirst();
        ((sg3.a) v0Var).getClass();
        sb6.append(c01.a2.e(str));
        for (java.lang.String str2 : linkedList.subList(1, linkedList.size())) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str2);
            sb6.append("、");
            sb6.append(e17);
        }
        final java.lang.String format = java.lang.String.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f574848lo4), sb6);
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.multitalk.ilinkservice.c$$a
            @Override // java.lang.Runnable
            public final void run() {
                db5.t7.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, format);
            }
        });
    }
}
