package fg;

/* loaded from: classes7.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f343326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fg.b0 b0Var) {
        super(4);
        this.f343326d = b0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String value = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        java.lang.String str2 = (java.lang.String) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        fg.b0 b0Var = this.f343326d;
        b0Var.getClass();
        org.json.JSONObject put = new org.json.JSONObject().put("value", value).put("keyCode", (int) (value.length() > 0 ? value.charAt(value.length() - 1) : (char) 0)).put("cursor", intValue);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(put, "put(...)");
        if (str != null) {
            put.put("encryptedValue", str);
        }
        if (str2 != null) {
            put.put("encryptError", str2);
        }
        java.lang.String jSONObject = put.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        b0Var.m120206x738236e6("(function(){    var focusElement = document.activeElement;    if(focusElement){        if(focusElement.onkeyboardcomplete){            focusElement.onkeyboardcomplete(" + jSONObject + ");        }        focusElement.blur();    }})();", fg.k.f343313a);
        sf.c cVar = sf.c.f488472a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = b0Var.f343260d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a17 = oaVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar2 = b0Var.f343260d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar2);
        cVar.a(a17, oaVar2.b(), new sf.b(0, 0, b0Var.f343268l, new fg.n(b0Var)));
        return jz5.f0.f384359a;
    }
}
