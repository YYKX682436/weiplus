package com.p314xaae8f345.mm.p2611x1bbd4e96.ui;

@db5.a(m123858x6ac9171 = 7)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sensitive/ui/SysPermissionDialogUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "sensitive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sensitive.ui.SysPermissionDialogUI */
/* loaded from: classes15.dex */
public final class ActivityC21022xd1345258 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: h, reason: collision with root package name */
    public static yz5.q f274726h;

    /* renamed from: d, reason: collision with root package name */
    public int f274727d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f274728e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f274729f;

    /* renamed from: g, reason: collision with root package name */
    public int f274730g = -1;

    public final void T6(d85.g0 g0Var, yz5.l lVar) {
        j85.h.b(j85.h.f379791a, 101L, java.lang.Long.valueOf(g0Var.f308726e), null, null, 12, null);
        k85.t tVar = k85.t.f386972a;
        int i17 = this.f274730g;
        tVar.j(this, g0Var, (i17 == 1001 || i17 == 1002) ? d85.f0.U : null, new k85.v(g0Var, this, lVar));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i17 = mo55332x76847179().getResources().getConfiguration().orientation;
        vj5.o.e(getWindow());
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_PERMISSION_LIST");
        jz5.f0 f0Var = null;
        java.lang.String[] strArr = stringArrayListExtra != null ? (java.lang.String[]) stringArrayListExtra.toArray(new java.lang.String[0]) : null;
        this.f274730g = getIntent().getIntExtra("KEY_PERMISSION_REQUEST_CODE", -1);
        if (strArr != null) {
            this.f274728e = new java.util.ArrayList();
            for (java.lang.String str : strArr) {
                java.util.HashMap hashMap = e85.i.f331848a;
                d85.g0 g0Var = (d85.g0) e85.i.f331849b.get(str);
                if (g0Var != null) {
                    java.util.ArrayList arrayList = this.f274728e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
                    if (!(true ^ arrayList.contains(g0Var))) {
                        g0Var = null;
                    }
                    if (g0Var != null) {
                        java.util.ArrayList arrayList2 = this.f274728e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList2);
                        arrayList2.add(g0Var);
                    }
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = this.f274728e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList4);
            arrayList3.addAll(arrayList4);
            this.f274729f = arrayList3;
            yz5.q qVar = f274726h;
            this.f274727d = qVar != null ? qVar.hashCode() : 0;
            java.util.ArrayList arrayList5 = this.f274729f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList5);
            if (!(!arrayList5.isEmpty())) {
                arrayList5 = null;
            }
            jz5.f0 f0Var2 = jz5.f0.f384359a;
            if (arrayList5 != null) {
                T6((d85.g0) kz5.n0.X(arrayList5), new k85.u(this, strArr));
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                getIntent().putExtra("IS_FROM_DELEGATE", true);
                java.util.ArrayList arrayList6 = this.f274728e;
                if (arrayList6 != null) {
                    java.util.Iterator it = arrayList6.iterator();
                    while (it.hasNext()) {
                        j85.h.b(j85.h.f379791a, 151L, java.lang.Long.valueOf(((d85.g0) it.next()).f308726e), null, null, 12, null);
                    }
                }
                z2.h.a(this, strArr, this.f274730g);
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        java.util.HashMap hashMap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        int length = grantResults.length;
        int i18 = 0;
        int i19 = 0;
        while (i18 < length) {
            int i27 = grantResults[i18];
            int i28 = i19 + 1;
            java.util.HashMap hashMap2 = e85.i.f331848a;
            d85.g0 g0Var = (d85.g0) e85.i.f331849b.get(permissions[i19]);
            if (g0Var != null) {
                int i29 = grantResults[i19];
                j85.h hVar = j85.h.f379791a;
                int i37 = g0Var.f308726e;
                if (i29 != -1) {
                    e85.h hVar2 = (e85.h) e85.i.f331848a.get(g0Var);
                    if (hVar2 != null && (hashMap = hVar2.f331847c) != null) {
                        for (java.util.Map.Entry entry : hashMap.entrySet()) {
                            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).sj(g0Var.f308725d, ((d85.f0) entry.getKey()).f308709d, !r9.mj(g0Var, (d85.f0) entry.getKey()));
                        }
                    }
                    j85.h.b(hVar, 162L, java.lang.Long.valueOf(i37), null, java.lang.Boolean.TRUE, 4, null);
                } else if (z2.h.b(mo55332x76847179(), permissions[i19])) {
                    j85.h.b(hVar, 163L, java.lang.Long.valueOf(i37), null, java.lang.Boolean.TRUE, 4, null);
                } else {
                    j85.h.b(hVar, 164L, java.lang.Long.valueOf(i37), null, java.lang.Boolean.TRUE, 4, null);
                }
            }
            i18++;
            i19 = i28;
        }
        finish();
        yz5.q qVar = f274726h;
        if (qVar != null) {
            qVar.mo147xb9724478(java.lang.Integer.valueOf(i17), permissions, grantResults);
        }
        yz5.q qVar2 = f274726h;
        if ((qVar2 != null ? qVar2.hashCode() : 0) == this.f274727d) {
            f274726h = null;
        }
    }
}
