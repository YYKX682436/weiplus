package p43;

/* loaded from: classes4.dex */
public final class g extends j43.a {
    @Override // j43.d
    public java.lang.String a() {
        return "INSERT OR REPLACE INTO `LocalGameReport` (`pkgName`,`lastReportTimeStamp`) VALUES (?,?)";
    }

    @Override // j43.a
    public void b(p75.k stmt, java.lang.Object obj) {
        p43.e entity = (p43.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stmt, "stmt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity, "entity");
        ((p75.e0) stmt).a(new java.lang.Object[]{entity.f68053x55b38832, java.lang.Long.valueOf(entity.f68052xac7571e7)});
    }
}
