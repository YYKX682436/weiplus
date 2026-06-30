package zo1;

/* loaded from: classes5.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f f556185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f f556186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f fVar) {
        super(0);
        this.f556185d = activityC12867x6b26c82f;
        this.f556186e = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f = this.f556185d;
        if (!activityC12867x6b26c82f.isFinishing() && !activityC12867x6b26c82f.isDestroyed()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f fVar = this.f556186e;
            int i17 = 0;
            boolean z17 = fVar == null;
            java.lang.String str = activityC12867x6b26c82f.f174332e;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "Get Restore Conversation Failed!");
                java.lang.String string = activityC12867x6b26c82f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvj);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f.a7(activityC12867x6b26c82f, string, null, activityC12867x6b26c82f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aby), new zo1.i0(activityC12867x6b26c82f));
            } else {
                if (activityC12867x6b26c82f.f174344t) {
                    android.widget.LinearLayout linearLayout = activityC12867x6b26c82f.f174334g;
                    if (linearLayout == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mainContentLl");
                        throw null;
                    }
                    linearLayout.setVisibility(0);
                    activityC12867x6b26c82f.c7().setVisibility(8);
                    activityC12867x6b26c82f.f174344t = false;
                }
                java.util.ArrayList newItems = activityC12867x6b26c82f.f174345u;
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator it = newItems.iterator();
                while (it.hasNext()) {
                    zo1.s sVar = (zo1.s) it.next();
                    java.lang.String str2 = sVar.f556295c ? sVar.f556293a : null;
                    if (str2 != null) {
                        hashSet.add(str2);
                    }
                }
                newItems.clear();
                java.util.LinkedList linkedList = fVar.f297357d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getConversationId(...)");
                int i18 = 0;
                for (java.lang.Object obj : linkedList) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str3 = (java.lang.String) obj;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                    java.lang.Object obj2 = fVar.f297358e.get(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    newItems.add(new zo1.s(str3, ((java.lang.Number) obj2).longValue(), hashSet.contains(str3)));
                    i18 = i19;
                }
                android.widget.Spinner spinner = activityC12867x6b26c82f.f174335h;
                if (spinner == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("typeSpinner");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f.Z6(activityC12867x6b26c82f, newItems, spinner.getSelectedItemPosition());
                zo1.w wVar = activityC12867x6b26c82f.f174340p;
                if (wVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("conversationAdapter");
                    throw null;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newItems, "newItems");
                wVar.f556338e = newItems;
                if (!newItems.isEmpty()) {
                    java.util.Iterator it6 = newItems.iterator();
                    while (it6.hasNext()) {
                        if (((zo1.s) it6.next()).f556295c && (i17 = i17 + 1) < 0) {
                            kz5.c0.o();
                            throw null;
                        }
                    }
                }
                wVar.f556339f = i17;
                wVar.m8146xced61ae5();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "loadDataImpl done");
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC12867x6b26c82f.f174343s;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            activityC12867x6b26c82f.f174343s = null;
        }
        return jz5.f0.f384359a;
    }
}
