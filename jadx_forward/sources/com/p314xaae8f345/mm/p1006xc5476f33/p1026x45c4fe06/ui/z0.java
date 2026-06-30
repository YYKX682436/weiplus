package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class z0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f171892a;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257) {
        this.f171892a = new java.lang.ref.WeakReference(activityC12636x4eed9257);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257;
        java.lang.String str;
        int i17;
        java.lang.Object obj;
        java.lang.Object obj2;
        super.handleMessage(message);
        int i18 = message.what;
        java.lang.ref.WeakReference weakReference = this.f171892a;
        if (i18 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed92572 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257) weakReference.get();
            if (activityC12636x4eed92572 == null) {
                return;
            }
            com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3 = (com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3) message.obj;
            activityC12636x4eed92572.M = true;
            if (c11162xe78737a3 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.V6(activityC12636x4eed92572, activityC12636x4eed92572.f170834d, null, activityC12636x4eed92572.f170835e);
                return;
            } else {
                activityC12636x4eed92572.N = c11162xe78737a3;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.V6(activityC12636x4eed92572, activityC12636x4eed92572.f170834d, c11162xe78737a3, activityC12636x4eed92572.f170835e);
                return;
            }
        }
        if (i18 == 2 && (activityC12636x4eed9257 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257) weakReference.get()) != null) {
            com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = (com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5) message.obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.X6(activityC12636x4eed9257);
            if (c11158xe7d16ed5 == null) {
                db5.t7.m123883x26a183b(activityC12636x4eed9257, activityC12636x4eed9257.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), 1).show();
                return;
            }
            com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a32 = activityC12636x4eed9257.N;
            c11162xe78737a32.getClass();
            c11162xe78737a32.f153367d = c11158xe7d16ed5.f153323p;
            c11162xe78737a32.f153368e = c11158xe7d16ed5.f153322o;
            com.p314xaae8f345.mm.p965xc41bc71e.C11160x93f17146 c11160x93f17146 = c11158xe7d16ed5.f153321n;
            if (c11160x93f17146 == null || (str = c11160x93f17146.f153358h) == null) {
                str = "";
            }
            c11162xe78737a32.f153370g = str;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList<com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3> arrayList2 = c11158xe7d16ed5.f153318h;
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                i17 = 0;
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it.next();
                android.os.Parcel obtain = android.os.Parcel.obtain();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
                c11159x8f55e6d3.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                arrayList.add(new com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3(obtain));
                obtain.recycle();
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.addAll(c11162xe78737a32.f153369f);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                int i19 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) next;
                java.util.Iterator it7 = arrayList3.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj2 = it7.next();
                        if (android.text.TextUtils.equals(((com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj2).f153336f, c11159x8f55e6d32.f153336f)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d33 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj2;
                if (c11159x8f55e6d33 != null) {
                    arrayList3.set(arrayList3.indexOf(c11159x8f55e6d33), c11159x8f55e6d32);
                }
                i17 = i19;
            }
            c11162xe78737a32.f153369f = arrayList3;
            for (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d34 : arrayList2) {
                com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed52 = c11162xe78737a32.f153371h;
                java.util.Iterator it8 = c11158xe7d16ed52.f153318h.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        obj = it8.next();
                        if (android.text.TextUtils.equals(c11159x8f55e6d34.f153336f, ((com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj).f153336f)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                java.util.ArrayList arrayList4 = c11158xe7d16ed52.f153318h;
                arrayList4.set(kz5.n0.c0(arrayList4, (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj), c11159x8f55e6d34);
            }
            if (activityC12636x4eed9257.N.f153367d) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).h("preference_key_subscribe_msg");
                if (h17 != null) {
                    h17.H(activityC12636x4eed9257.N.f153368e ? "" : activityC12636x4eed9257.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a58));
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).notifyDataSetChanged();
                }
            } else {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).w("preference_key_subscribe_msg");
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).notifyDataSetChanged();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.d7(activityC12636x4eed9257.f170836f, activityC12636x4eed9257.f170834d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.c7(activityC12636x4eed9257.f170836f, activityC12636x4eed9257.f170834d);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6210x3f282433 c6210x3f282433 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6210x3f282433();
            java.lang.String str2 = activityC12636x4eed9257.f170838h;
            am.g00 g00Var = c6210x3f282433.f136460g;
            g00Var.f88257a = str2;
            g00Var.f88258b = activityC12636x4eed9257.N.f153368e ? 2 : 1;
            g00Var.f88259c = 1;
            c6210x3f282433.e();
        }
    }
}
