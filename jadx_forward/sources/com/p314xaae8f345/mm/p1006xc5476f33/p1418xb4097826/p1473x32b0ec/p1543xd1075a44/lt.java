package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class lt extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ht {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f200509f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt(java.util.List options, yz5.l onOptionSelected) {
        super(options, onOptionSelected);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onOptionSelected, "onOptionSelected");
        this.f200509f = "";
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jt holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jt) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        dk2.ic icVar = (dk2.ic) this.f200131d.get(i17);
        java.lang.String str = icVar.f315156b;
        android.widget.CheckBox checkBox = holder.f200307d;
        checkBox.setText(str);
        checkBox.setChecked(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f200509f, icVar.f315155a));
        checkBox.setClickable(!checkBox.isChecked());
        checkBox.setTag(icVar);
        checkBox.setOnCheckedChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kt(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ht
    public java.util.Set x() {
        return this.f200509f.length() == 0 ? kz5.r0.f395535d : kz5.o1.c(this.f200509f);
    }
}
