package xt0;

/* loaded from: classes5.dex */
public abstract class a {
    public final void a(bu0.c cVar) {
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseComposingJumper", "fillMusicInfo: musicInfo null");
            return;
        }
        byte[] bArr = cVar.f106021b;
        byte[] bArr2 = cVar.f106023d;
        java.lang.Integer num = cVar.f106022c;
        if (num != null) {
            ut3.f.f512709c.e(num.intValue());
        }
        ut3.f fVar = ut3.f.f512709c;
        fVar.f512711b.putString("ORIGIN_MUSIC_ID", cVar.f106020a);
        fVar.f512711b.putByteArray("ORIGIN_MUSIC_INFO", bArr);
        fVar.f512711b.putByteArray("MEDIA_EXTRA_MUSIC", bArr2);
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = configProvider.I;
        if (c16995x8ab634cd != null) {
            ut3.f fVar = ut3.f.f512709c;
            fVar.f512711b.putLong("key_ref_feed_id", c16995x8ab634cd.f237227h);
            fVar.f512711b.putString("key_ref_feed_dup_flag", c16995x8ab634cd.f237228i);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd2 = configProvider.I;
        if (c16995x8ab634cd2 != null) {
            ut3.f.f512709c.f512711b.putInt("key_ref_enter_scene", c16995x8ab634cd2.f237226g);
        }
    }
}
