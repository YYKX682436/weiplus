package ur1;

@j95.b
/* loaded from: classes7.dex */
public final class s extends i95.w implements rm.b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f511905d = com.p314xaae8f345.mm.vfs.q7.c("biz_draft");

    public void Ai(int i17, java.lang.String sceneSubPath, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneSubPath, "sceneSubPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "clear draft draftType: " + i17 + ", scene: " + sceneSubPath + ", bizType: " + i18);
        if (!wi(sceneSubPath)) {
            ((ku5.t0) ku5.t0.f394148d).h(new ur1.o(i17, this, sceneSubPath), "BizPersonalDraftFile");
            return;
        }
        tk.s[] sVarArr = tk.s.f501403d;
        if (i18 == 2) {
            Di().remove("photo_picture_draft_key");
            return;
        }
        if (i17 == 1) {
            Di().remove("article_draft_key");
            return;
        }
        if (i17 == 2) {
            Di().remove("picture_draft_key");
        } else {
            if (i17 != 3) {
                return;
            }
            Di().remove("article_draft_key");
            Di().remove("picture_draft_key");
        }
    }

    public boolean Bi(int i17, java.lang.String sceneSubPath, int i18, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 publishScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneSubPath, "sceneSubPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(publishScene, "publishScene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "draftExists draftType: " + i17 + ", scene: " + sceneSubPath + ", bizType: " + i18 + ", publishScene: " + publishScene);
        tk.r rVar = (tk.r) i95.n0.c(tk.r.class);
        if (i17 == 2) {
            if (((ox.z) rVar).Di(Ui(sceneSubPath), i18, publishScene)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "draftExists in new image editor, scene: " + publishScene);
                return true;
            }
        }
        tk.s[] sVarArr = tk.s.f501403d;
        if (i18 == 2) {
            return Di().contains(Ni(i17, i18));
        }
        if (wi(sceneSubPath)) {
            boolean contains = Di().contains(Ni(i17, i18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "draftExists use mmkv, hasDraft: " + contains + ", scene: " + publishScene);
            return contains;
        }
        java.lang.String Ri = Ri(i17, sceneSubPath);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(Ri);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(Ri.concat("/LocalDraft"));
            java.lang.String str2 = a18.f294812f;
            if (str2 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l18)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
            if (!m18.a() ? false : m18.f294799a.F(m18.f294800b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "draftExists use file, hasDraft: true, scene: " + publishScene);
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "draftExists use file, hasDraft: false, scene: " + publishScene);
        return false;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Di() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(gm0.m.i() + "_personal_center_draft_mmkv_name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        return M;
    }

    public final java.lang.String Ni(int i17, int i18) {
        tk.s[] sVarArr = tk.s.f501403d;
        return i18 == 2 ? "photo_picture_draft_key" : i17 == 1 ? "article_draft_key" : "picture_draft_key";
    }

    public final java.lang.String Ri(int i17, java.lang.String str) {
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(android.util.Base64.encodeToString(bytes, 10));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "scenePath is " + a17);
        return f511905d + '/' + (i17 == 1 ? "Article" : "Picture") + '/' + a17;
    }

    public final java.lang.String Ui(java.lang.String draftScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftScene, "draftScene");
        return ((draftScene.length() == 0) || u46.l.d("personalCenter", draftScene)) ? "" : draftScene;
    }

    public void Vi(int i17, java.lang.String sceneSubPath, int i18, yz5.l draftDataCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneSubPath, "sceneSubPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftDataCallback, "draftDataCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "read draft draftType: " + i17 + ", scene: " + sceneSubPath + ", bizType: " + i18);
        tk.r rVar = (tk.r) i95.n0.c(tk.r.class);
        if (i17 == 2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rVar);
            if (((ox.z) rVar).Di(Ui(sceneSubPath), i18, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_UNKNOWN)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "read draft in new image editor");
                java.lang.String Ui = Ui(sceneSubPath);
                final ur1.p pVar = new ur1.p(draftDataCallback);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "getDraftInNewImageEditor sceneSubPath: " + Ui + ", bizType: " + i18);
                com.p314xaae8f345.p3133xd0ce8b26.iam.biz.o0.f299296b.c(Ui, i18, new com.p314xaae8f345.p3133xd0ce8b26.iam.biz.n0(pVar) { // from class: ox.y

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ yz5.l f431070a;

                    {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pVar, "function");
                        this.f431070a = pVar;
                    }

                    @Override // com.p314xaae8f345.p3133xd0ce8b26.iam.biz.n0
                    public final /* synthetic */ void a(java.lang.String str) {
                        this.f431070a.mo146xb9724478(str);
                    }
                });
                return;
            }
        }
        Zi(i17, sceneSubPath, i18, draftDataCallback);
    }

    public void Zi(int i17, java.lang.String sceneSubPath, int i18, yz5.l draftDataCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneSubPath, "sceneSubPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftDataCallback, "draftDataCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "readWebDraft draftType: " + i17 + ", scene: " + sceneSubPath + ", bizType: " + i18);
        if (!wi(sceneSubPath)) {
            ((ku5.t0) ku5.t0.f394148d).h(new ur1.q(Ri(i17, sceneSubPath), draftDataCallback), "BizPersonalDraftFile");
            return;
        }
        java.lang.String Ni = Ni(i17, i18);
        java.lang.String u17 = Di().u(Ni, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "readWebDraft MMKV mmkvKey: " + Ni + ", contentLen: " + u17.length() + ", contentMd5: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(u17) + ", contentPrefix: " + r26.p0.E0(u17, 200));
        draftDataCallback.mo146xb9724478(u17);
    }

    public final boolean wi(java.lang.String str) {
        return (str.length() == 0) || u46.l.d("personalCenter", str);
    }
}
