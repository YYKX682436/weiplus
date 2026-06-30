package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes12.dex */
public final class es implements nl5.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15378x7431170f f213591a;

    public es(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15378x7431170f c15378x7431170f) {
        this.f213591a = c15378x7431170f;
    }

    @Override // nl5.u
    public void a(android.text.Editable editable, java.lang.CharSequence charSequence, int i17, int i18) {
        if (charSequence == null || editable == null) {
            return;
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(?m)^[ \t]*\r?\n");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(charSequence).replaceAll("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        this.f213591a.setText(editable.replace(i17, i18 + i17, replaceAll));
    }
}
