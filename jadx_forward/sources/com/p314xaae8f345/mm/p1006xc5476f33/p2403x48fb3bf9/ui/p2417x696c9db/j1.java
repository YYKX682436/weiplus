package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes15.dex */
public class j1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l1 f266383d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l1 l1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19318x97abd302 activityC19318x97abd302) {
        this.f266383d = l1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l1 l1Var = this.f266383d;
        java.util.LinkedList linkedList = l1Var.f267156d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19318x97abd302 activityC19318x97abd302 = l1Var.f267159g;
        r45.h04 h04Var = (r45.h04) linkedList.get(activityC19318x97abd302.f265196u.f265655i);
        r45.f14 f14Var = (r45.f14) h04Var.f457246h.get(((java.lang.Integer) obj).intValue());
        r45.c36 c36Var = l1Var.f267158f;
        r45.yv6 yv6Var = (r45.yv6) c36Var.f452788d.get(activityC19318x97abd302.f265196u.f265655i);
        yv6Var.f472961d = h04Var.f457242d;
        yv6Var.f472962e = f14Var.f455459d;
        l1Var.f267157e = new java.util.LinkedList();
        java.util.Iterator it = l1Var.f267156d.iterator();
        while (it.hasNext()) {
            r45.h04 h04Var2 = (r45.h04) it.next();
            java.util.LinkedList linkedList2 = h04Var2.f457245g;
            java.util.Iterator it6 = c36Var.f452788d.iterator();
            boolean z17 = false;
            int i17 = 0;
            while (it6.hasNext()) {
                r45.yv6 yv6Var2 = (r45.yv6) it6.next();
                java.util.Iterator it7 = linkedList2.iterator();
                while (it7.hasNext()) {
                    r45.b14 b14Var = (r45.b14) it7.next();
                    if (yv6Var2.f472961d == b14Var.f451960d && yv6Var2.f472962e == b14Var.f451961e) {
                        i17++;
                    }
                }
            }
            if (i17 == linkedList2.size() && i17 > 0) {
                z17 = true;
            }
            if (!z17) {
                l1Var.f267157e.add(h04Var2);
            }
        }
        l1Var.m8146xced61ae5();
        activityC19318x97abd302.U6();
    }
}
