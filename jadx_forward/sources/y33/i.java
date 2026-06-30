package y33;

/* loaded from: classes7.dex */
public final class i extends j43.a {
    public i(d95.b0 b0Var) {
        super(b0Var);
    }

    @Override // j43.d
    public java.lang.String a() {
        return "INSERT OR REPLACE INTO `GameSimpleUserInfo` (`compositionKey`,`userName`,`roomName`,`nickName`,`avatarURL`,`role`,`updateTime`) VALUES (?,?,?,?,?,?,?)";
    }

    @Override // j43.a
    public void b(p75.k stmt, java.lang.Object obj) {
        y33.g entity = (y33.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stmt, "stmt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity, "entity");
        java.lang.String field_compositionKey = entity.f68997xb2033e3a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_compositionKey, "field_compositionKey");
        p75.e0 e0Var = (p75.e0) stmt;
        e0Var.m157941x35198eae(1, field_compositionKey);
        java.lang.String field_userName = entity.f69002xdde069b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_userName, "field_userName");
        e0Var.m157941x35198eae(2, field_userName);
        java.lang.String field_roomName = entity.f69000x136b93ab;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_roomName, "field_roomName");
        e0Var.m157941x35198eae(3, field_roomName);
        java.lang.String field_nickName = entity.f68998x21eb2633;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_nickName, "field_nickName");
        e0Var.m157941x35198eae(4, field_nickName);
        java.lang.String str = entity.f68996x81118851;
        if (str == null) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = e0Var.f434167d;
            if (c26970x63d6eaa3 != null) {
                c26970x63d6eaa3.m107800x37fcf764(5);
            } else {
                com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 c26915x63d6eaa3 = e0Var.f434168e;
                if (c26915x63d6eaa3 != null) {
                    c26915x63d6eaa3.m106527x37fcf764(5);
                }
            }
        } else {
            e0Var.m157941x35198eae(5, str);
        }
        e0Var.m157940x37fbf859(6, entity.f68999x2261249b);
        e0Var.m157940x37fbf859(7, entity.f69001xa783a79b);
    }
}
