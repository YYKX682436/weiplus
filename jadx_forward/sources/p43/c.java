package p43;

/* loaded from: classes8.dex */
public final class c extends j43.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p43.d f433294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p43.d dVar, l75.k0 k0Var) {
        super(k0Var);
        this.f433294d = dVar;
    }

    @Override // j43.d
    public java.lang.String a() {
        return "INSERT OR REPLACE INTO `GameLocalVideoInfo` (`fileId`,`userId`,`appId`,`appName`,`filePath`,`orgFilePath`,`coverPath`,`extJsonData`,`createTime`,`durationSec`,`title`,`desc`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // j43.a
    public void b(p75.k stmt, java.lang.Object obj) {
        p43.a entity = (p43.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stmt, "stmt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity, "entity");
        java.lang.String str = entity.f67902xf9dbbe9c;
        p43.d dVar = this.f433294d;
        p43.d.y0(dVar, stmt, 1, str);
        p43.d.y0(dVar, stmt, 2, entity.f67906x13fe5d2b);
        p43.d.y0(dVar, stmt, 3, entity.f67895x28d45f97);
        p43.d.y0(dVar, stmt, 4, entity.f67896x453d1e07);
        p43.d.y0(dVar, stmt, 5, entity.f67903xf1e9b966);
        p43.d.y0(dVar, stmt, 6, entity.f67904x4326f700);
        p43.d.y0(dVar, stmt, 7, entity.f67897x109ca377);
        p43.d.y0(dVar, stmt, 8, entity.f67901x6985322e);
        p75.e0 e0Var = (p75.e0) stmt;
        e0Var.m157940x37fbf859(9, entity.f67898xac3be4e);
        e0Var.m157940x37fbf859(10, entity.f67900x4f407658);
        p43.d.y0(dVar, stmt, 11, entity.f67905x29dd02d3);
        p43.d.y0(dVar, stmt, 12, entity.f67899x225aa2b6);
    }
}
