package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class tv implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uv f201445d;

    public tv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uv uvVar) {
        this.f201445d = uvVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.util.Objects.toString(charSequence);
        int length = charSequence != null ? charSequence.length() : 0;
        int i27 = 16 - length;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uv uvVar = this.f201445d;
        fg2.q1 q1Var = uvVar.f201540m;
        if (q1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        q1Var.f343799c.setText(java.lang.String.valueOf(i27));
        if (i27 < 0) {
            fg2.q1 q1Var2 = uvVar.f201540m;
            if (q1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            q1Var2.f343799c.setTextColor(uvVar.f199914d.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            fg2.q1 q1Var3 = uvVar.f201540m;
            if (q1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            q1Var3.f343800d.setVisibility(0);
            fg2.q1 q1Var4 = uvVar.f201540m;
            if (q1Var4 != null) {
                q1Var4.f343798b.setEnabled(false);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
        }
        if (length != 0 || uvVar.f201541n) {
            fg2.q1 q1Var5 = uvVar.f201540m;
            if (q1Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            q1Var5.f343799c.setTextColor(uvVar.f199914d.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
            fg2.q1 q1Var6 = uvVar.f201540m;
            if (q1Var6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            q1Var6.f343800d.setVisibility(8);
            fg2.q1 q1Var7 = uvVar.f201540m;
            if (q1Var7 != null) {
                q1Var7.f343798b.setEnabled(true);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
        }
        fg2.q1 q1Var8 = uvVar.f201540m;
        if (q1Var8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        q1Var8.f343799c.setTextColor(uvVar.f199914d.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
        fg2.q1 q1Var9 = uvVar.f201540m;
        if (q1Var9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        q1Var9.f343800d.setVisibility(8);
        fg2.q1 q1Var10 = uvVar.f201540m;
        if (q1Var10 != null) {
            q1Var10.f343798b.setEnabled(false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }
}
