package mm2;

/* loaded from: classes3.dex */
public final class h0 {
    public h0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(r45.i30 i30Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i30Var, "<this>");
        return "url: " + i30Var.m75945x2fec8307(0) + " duration: " + i30Var.m75942xfb822ef2(2) + " md5: " + i30Var.m75945x2fec8307(1);
    }

    public final java.lang.String b(r45.nn1 nn1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nn1Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cheer_button_url: ");
        sb6.append(nn1Var.m75945x2fec8307(1));
        sb6.append(" enable: ");
        sb6.append(nn1Var.m75933x41a8a7f2(2));
        sb6.append(" landscape_resource: ");
        r45.i30 i30Var = (r45.i30) nn1Var.m75936x14adae67(3);
        sb6.append(i30Var != null ? a(i30Var) : null);
        sb6.append(" resource: ");
        r45.i30 i30Var2 = (r45.i30) nn1Var.m75936x14adae67(4);
        sb6.append(i30Var2 != null ? a(i30Var2) : null);
        sb6.append(" resource_id: ");
        sb6.append(nn1Var.m75942xfb822ef2(6));
        sb6.append(" total_duration: ");
        sb6.append(nn1Var.m75942xfb822ef2(7));
        sb6.append(" color: ");
        sb6.append(nn1Var.m75941xfb821914(5));
        return sb6.toString();
    }
}
