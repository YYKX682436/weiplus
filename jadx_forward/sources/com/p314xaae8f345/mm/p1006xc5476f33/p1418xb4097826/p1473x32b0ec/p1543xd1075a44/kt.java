package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class kt implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lt f200389a;

    public kt(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lt ltVar) {
        this.f200389a = ltVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton checkbox, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkbox, "checkbox");
        if (z17) {
            java.lang.Object tag = checkbox.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.FinderLiveQcPollResponseOption");
            dk2.ic icVar = (dk2.ic) tag;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lt ltVar = this.f200389a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ltVar.f200509f, icVar.f315155a)) {
                return;
            }
            ltVar.f200509f = icVar.f315155a;
            ltVar.m8151xc67946d3(0, ltVar.mo1894x7e414b06());
            ltVar.f200132e.mo146xb9724478(icVar);
        }
    }
}
