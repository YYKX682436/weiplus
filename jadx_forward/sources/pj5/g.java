package pj5;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2732xa7e798a.ActivityC22473xe216760f f436906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.ui.p2732xa7e798a.ActivityC22473xe216760f activityC22473xe216760f) {
        super(4);
        this.f436906d = activityC22473xe216760f;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.util.LinkedList linkedList = (java.util.LinkedList) obj4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SetMsgRemindCgi callback, errType: ");
        sb6.append(intValue);
        sb6.append(", errCode: ");
        sb6.append(intValue2);
        sb6.append(", errMsg: ");
        sb6.append((java.lang.String) obj3);
        sb6.append(", remindList: ");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScheduleMsgDetailUI", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (linkedList != null) {
            linkedList.removeIf(new pj5.e(currentTimeMillis));
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SetMsgRemindCgi callback, removed outdated remind, remindList: ");
        sb7.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScheduleMsgDetailUI", sb7.toString());
        int i17 = com.p314xaae8f345.mm.ui.p2732xa7e798a.ActivityC22473xe216760f.f291317e;
        com.p314xaae8f345.mm.ui.p2732xa7e798a.ActivityC22473xe216760f activityC22473xe216760f = this.f436906d;
        em.u3 T6 = activityC22473xe216760f.T6();
        if (T6.f336383b == null) {
            T6.f336383b = (android.widget.ProgressBar) T6.f336382a.findViewById(com.p314xaae8f345.mm.R.id.v0q);
        }
        T6.f336383b.setVisibility(8);
        if (intValue == 0 && intValue2 == 0) {
            activityC22473xe216760f.T6().a().setText(activityC22473xe216760f.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p6v));
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC22473xe216760f.mo55332x76847179();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            mo55332x76847179.getText(com.p314xaae8f345.mm.R.C30867xcad56011.p7a);
            activityC22473xe216760f.T6().a().setText(activityC22473xe216760f.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p7a));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 b17 = activityC22473xe216760f.T6().b();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!(linkedList == null || linkedList.isEmpty()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf, b17)) == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(b17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue4 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue4));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(b17, arrayList4.toArray(), "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 a17 = activityC22473xe216760f.T6().a();
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(linkedList == null || linkedList.isEmpty());
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(a17, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue5 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue5));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(a17, arrayList6.toArray(), "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf2, a17)) == null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(a17, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue6 = ((java.lang.Integer) arrayList7.get(0)).intValue();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(intValue6));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(a17, arrayList8.toArray(), "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!(linkedList == null || linkedList.isEmpty())) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 b18 = activityC22473xe216760f.T6().b();
            xm3.t0 t0Var = new xm3.t0(new pj5.b(linkedList), activityC22473xe216760f, new in5.s() { // from class: com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI$onCreate$2$1$2
                @Override // in5.s
                /* renamed from: getItemConvert */
                public pj5.t mo43555xf2bb75ea(int type) {
                    return new pj5.t();
                }
            }, false);
            t0Var.f536913J = false;
            t0Var.mo8163xed962dec(new pj5.f(activityC22473xe216760f));
            b18.mo7960x6cab2c8d(t0Var);
        }
        return jz5.f0.f384359a;
    }
}
