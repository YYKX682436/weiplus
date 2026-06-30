package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class ft implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gt f199906a;

    public ft(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gt gtVar) {
        this.f199906a = gtVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton checkbox, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkbox, "checkbox");
        java.lang.Object tag = checkbox.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.FinderLiveQcPollResponseOption");
        dk2.ic icVar = (dk2.ic) tag;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gt gtVar = this.f199906a;
        java.lang.String str = icVar.f315155a;
        if (!z17) {
            ((java.util.HashSet) gtVar.f200010f).remove(str);
        } else {
            ((java.util.HashSet) gtVar.f200010f).add(str);
            gtVar.f200132e.mo146xb9724478(icVar);
        }
    }
}
