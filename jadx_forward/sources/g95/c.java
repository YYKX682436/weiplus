package g95;

/* loaded from: classes.dex */
public final class c implements p75.s {
    @Override // p75.r
    public java.lang.String b() {
        return " case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
    }
}
