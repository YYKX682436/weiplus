package ox2;

/* loaded from: classes2.dex */
public final class j implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e f431209a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e) {
        this.f431209a = c15408x626e05e;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        lz5.m mVar = new lz5.m();
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emoji = this.f431209a.getEmoji();
        if (emoji != null) {
            mVar.put("easter_egg_emoji_md5", emoji.mo42933xb5885648());
            mVar.put("emoticon_designerid", emoji.X0());
            mVar.put("emoticon_activityid", emoji.S0());
            mVar.put("emoticon_pid", emoji.mo42930x4f4a97c4());
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_unexp")) {
            mVar.put("easter_egg_unexp_type", 1);
        }
        return kz5.b1.b(mVar);
    }
}
