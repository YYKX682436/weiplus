package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0 f283721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283722e;

    public e0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0 h0Var, java.util.List list) {
        this.f283721d = h0Var;
        this.f283722e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc c21744x29417dbc = this.f283721d.f283771g;
        if (c21744x29417dbc != null) {
            java.util.List dataList = this.f283722e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiHistoryListFragment", "[onDataBatchLoaded] :: batch added dataList size: " + dataList.size());
            if (c21744x29417dbc.f282084t == null) {
                return;
            }
            c21744x29417dbc.f282088x = false;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = dataList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((zb5.c) next).f552843c == 0) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() < 50) {
                c21744x29417dbc.f282087w = true;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var = c21744x29417dbc.f282082r;
            if (h0Var != null) {
                int size = ((java.util.ArrayList) h0Var.f282507g).size();
                ((java.util.ArrayList) h0Var.f282507g).addAll(dataList);
                h0Var.m8153xd399a4d9(size, ((java.util.ArrayList) h0Var.f282507g).size());
            }
        }
    }
}
