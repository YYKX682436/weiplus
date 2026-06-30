package y43;

/* loaded from: classes8.dex */
public final class g extends j43.a {
    @Override // j43.d
    public java.lang.String a() {
        return "INSERT OR REPLACE INTO `LocalLiteAppConf` (`url`,`appid`,`path`,`expire_duration`,`refresh_duration`,`wepkg_id`,`updateTime`,`hasLiteConf`) VALUES (?,?,?,?,?,?,?,?)";
    }

    @Override // j43.a
    public void b(p75.k stmt, java.lang.Object obj) {
        y43.e entity = (y43.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stmt, "stmt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity, "entity");
        ((p75.e0) stmt).a(new java.lang.Object[]{entity.f68184x4b6e88aa, entity.f68178x28d46377, entity.f68181x2260084a, java.lang.Integer.valueOf(entity.f68179x61c4976f), java.lang.Integer.valueOf(entity.f68182x7654871d), entity.f68185xb772261, java.lang.Long.valueOf(entity.f68183xa783a79b), java.lang.Boolean.valueOf(entity.f68180x6822e1e7)});
    }
}
