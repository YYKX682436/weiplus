package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public class k5 extends com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.f {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 f182750m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257, android.content.Context context) {
        super(context);
        this.f182750m = activityC13570xd6b9f257;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.f
    public void k(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de c13620xa33772de = this.f182750m.f181935p;
        java.util.List list = c13620xa33772de.f183085g;
        ((java.util.LinkedList) list).add(str);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a5 = c13620xa33772de.f183083e;
        if (c13623x735f56a5 == null) {
            return;
        }
        c13623x735f56a5.m79125xd60a4a33("");
        c13620xa33772de.f183083e.d(str, true);
        if (c13620xa33772de.f183087i == null) {
            return;
        }
        c13620xa33772de.c(c13620xa33772de.f183083e.m79118xdb574fcd());
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5) c13620xa33772de.f183087i).a(c13620xa33772de.f183084f, c13620xa33772de.f183086h, list, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11126, 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.f
    public void l(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de c13620xa33772de = this.f182750m.f181935p;
        java.util.List list = c13620xa33772de.f183085g;
        ((java.util.LinkedList) list).remove(str);
        if (c13620xa33772de.f183083e == null) {
            return;
        }
        if (list.isEmpty()) {
            c13620xa33772de.f183083e.m79125xd60a4a33(c13620xa33772de.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8));
        }
        c13620xa33772de.f183083e.p(str);
        if (c13620xa33772de.f183087i == null) {
            return;
        }
        c13620xa33772de.c(c13620xa33772de.f183083e.m79118xdb574fcd());
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5) c13620xa33772de.f183087i).a(c13620xa33772de.f183084f, c13620xa33772de.f183086h, list, true);
    }
}
