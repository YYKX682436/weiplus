package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class rh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.un3 f291278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21435x7826ced5 f291279e;

    public rh(com.p314xaae8f345.mm.ui.ActivityC21435x7826ced5 activityC21435x7826ced5, r45.un3 un3Var) {
        this.f291279e = activityC21435x7826ced5;
        this.f291278d = un3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.ActivityC21435x7826ced5 activityC21435x7826ced5 = this.f291279e;
        if (activityC21435x7826ced5.f278595i == 1) {
            java.util.LinkedList linkedList = this.f291278d.f469026g;
            activityC21435x7826ced5.getClass();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.q06 q06Var = (r45.q06) it.next();
                com.p314xaae8f345.mm.ui.vh vhVar = new com.p314xaae8f345.mm.ui.vh(null);
                vhVar.f292690a = q06Var.f465070d;
                vhVar.f292692c = q06Var.f465072f;
                vhVar.f292691b = q06Var.f465073g;
                linkedList2.add(vhVar);
            }
            java.util.LinkedList linkedList3 = activityC21435x7826ced5.f278592f.f294093h;
            linkedList3.clear();
            if (!linkedList2.isEmpty()) {
                linkedList3.addAll(linkedList2);
            }
            activityC21435x7826ced5.f278592f.notifyDataSetChanged();
        }
    }
}
