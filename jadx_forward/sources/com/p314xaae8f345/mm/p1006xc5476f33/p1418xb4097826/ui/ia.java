package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class ia extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15045x9eacaabe f210890g;

    public ia(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15045x9eacaabe activityC15045x9eacaabe) {
        this.f210890g = activityC15045x9eacaabe;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return event instanceof ec2.f;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        ec2.f fVar = ev6 instanceof ec2.f ? (ec2.f) ev6 : null;
        if (fVar == null) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15045x9eacaabe.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15045x9eacaabe activityC15045x9eacaabe = this.f210890g;
        activityC15045x9eacaabe.d7().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ha(fVar, activityC15045x9eacaabe));
    }
}
