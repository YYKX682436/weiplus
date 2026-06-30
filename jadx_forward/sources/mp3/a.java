package mp3;

/* loaded from: classes5.dex */
public class a extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.k55 f411983b = new r45.k55();

    @Override // ot0.h
    public ot0.h a() {
        mp3.a aVar = new mp3.a();
        aVar.f411983b = this.f411983b;
        return aVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        r45.k55 k55Var = this.f411983b;
        java.util.Map map = bm5.d1.f104091a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("<patMsg><chatUser>");
        java.lang.String str2 = k55Var.f459918d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        sb7.append(str2);
        sb7.append("</chatUser><records><recordNum>");
        java.util.LinkedList linkedList = k55Var.f459919e;
        sb7.append(linkedList.size());
        sb7.append("</recordNum>");
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.l55 l55Var = (r45.l55) it.next();
            sb7.append("<record><fromUser>");
            java.lang.String str3 = l55Var.f460685d;
            if (str3 == null) {
                str3 = "";
            }
            sb7.append(str3);
            sb7.append("</fromUser><pattedUser>");
            java.lang.String str4 = l55Var.f460686e;
            if (str4 == null) {
                str4 = "";
            }
            sb7.append(str4);
            sb7.append("</pattedUser><template>");
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(l55Var.f460687f));
            sb7.append("</template>");
            if (l55Var instanceof bm5.c1) {
                sb7.append("<templete>");
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(((bm5.c1) l55Var).f104089o));
                sb7.append("</templete>");
            }
            sb7.append("<createTime>");
            sb7.append(l55Var.f460688g);
            sb7.append("</createTime><readStatus>");
            sb7.append(l55Var.f460689h);
            sb7.append("</readStatus><svrId>");
            sb7.append(l55Var.f460690i);
            sb7.append("</svrId><showModifyTip>");
            sb7.append(l55Var.f460691m);
            sb7.append("</showModifyTip><isNewPatMsg>");
            sb7.append(l55Var.f460692n);
            sb7.append("</isNewPatMsg></record>");
        }
        sb7.append("</records></patMsg>");
        sb6.append(sb7.toString());
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f411983b = bm5.d1.f(".msg.appmsg", map);
    }
}
