package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class yh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei f201980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei eiVar) {
        super(0);
        this.f201980d = eiVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        android.text.Editable text;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei eiVar = this.f201980d;
        android.widget.EditText editText = eiVar.f199789o;
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        eiVar.m58028xf33851c3(str);
        java.lang.String m58024xbcef56b7 = eiVar.m58024xbcef56b7();
        boolean z17 = false;
        if (!(m58024xbcef56b7 == null || m58024xbcef56b7.length() == 0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eiVar.m58024xbcef56b7(), eiVar.m58025xcd4de16d())) {
            z17 = true;
        }
        eiVar.d(z17);
        return jz5.f0.f384359a;
    }
}
