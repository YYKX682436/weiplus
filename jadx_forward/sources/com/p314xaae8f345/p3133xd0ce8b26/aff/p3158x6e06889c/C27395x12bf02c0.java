package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest */
/* loaded from: classes2.dex */
public class C27395x12bf02c0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 f59802xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0();

    /* renamed from: baseRequest */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e f59803xca7c667e = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e.m113875x7c90cfc0();

    /* renamed from: finder_basereq */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 f59806x29f68d14 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258.m114182x7c90cfc0();

    /* renamed from: object_uid_list */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f> f59810x5fe89c2d = new java.util.LinkedList<>();

    /* renamed from: scene */
    public int f59811x683188c = 0;

    /* renamed from: live_report_scene */
    public int f59809xcf1cb234 = 0;

    /* renamed from: comment_scene */
    public int f59805xbe0ae6ac = 0;

    /* renamed from: finder_username */
    public java.lang.String f59807x6b930ccf = "";

    /* renamed from: client_user_agent */
    public java.lang.String f59804xfeb2f285 = "";

    /* renamed from: uxinfo */
    public java.lang.String f59815xce7369d1 = "";

    /* renamed from: scenes */
    public java.util.LinkedList<java.lang.Integer> f59812xc9dff967 = new java.util.LinkedList<>();

    /* renamed from: is_refresh */
    public boolean f59808x9a1f7cc6 = false;

    /* renamed from: trigger_scene */
    public int f59813xb659a745 = 0;

    /* renamed from: user_location */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation f59814x7452f9a9 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation.m114288x7c90cfc0();

    /* renamed from: com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest$UserLocation */
    /* loaded from: classes2.dex */
    public static class UserLocation extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation f59816xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation();

        /* renamed from: longitude */
        public float f59818x83009af = 0.0f;

        /* renamed from: latitude */
        public float f59817xaa2bac6c = 0.0f;

        /* renamed from: create */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation m114287xaf65a0fc() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation m114288x7c90cfc0() {
            return f59816xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation m114289x3136c9db() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation();
        }

        /* renamed from: build */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation m114290x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation)) {
                return false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation userLocation = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation) fVar;
            return n51.f.a(java.lang.Float.valueOf(this.f59818x83009af), java.lang.Float.valueOf(userLocation.f59818x83009af)) && n51.f.a(java.lang.Float.valueOf(this.f59817xaa2bac6c), java.lang.Float.valueOf(userLocation.f59817xaa2bac6c));
        }

        /* renamed from: getLatitude */
        public float m114291x2605e9e2() {
            return this.f59817xaa2bac6c;
        }

        /* renamed from: getLongitude */
        public float m114292x79d7af9() {
            return this.f59818x83009af;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation m114293x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                fVar.d(1, this.f59818x83009af);
                fVar.d(2, this.f59817xaa2bac6c);
                return 0;
            }
            if (i17 == 1) {
                return b36.f.d(1, this.f59818x83009af) + 0 + b36.f.d(2, this.f59817xaa2bac6c);
            }
            if (i17 == 2) {
                c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
                for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                    if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                        aVar.b();
                    }
                }
                return 0;
            }
            if (i17 != 3) {
                return -1;
            }
            c36.a aVar2 = (c36.a) objArr[0];
            int intValue = ((java.lang.Integer) objArr[2]).intValue();
            if (intValue == 1) {
                this.f59818x83009af = aVar2.f(intValue);
                return 0;
            }
            if (intValue != 2) {
                return -1;
            }
            this.f59817xaa2bac6c = aVar2.f(intValue);
            return 0;
        }

        /* renamed from: setLatitude */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation m114295x20be4aee(float f17) {
            this.f59817xaa2bac6c = f17;
            return this;
        }

        /* renamed from: setLongitude */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation m114296x63f13b6d(float f17) {
            this.f59818x83009af = f17;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation m114294x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114230xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114231x7c90cfc0() {
        return f59802xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114232x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0();
    }

    /* renamed from: addAllElementObjectUidList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114233xfff0f893(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f> collection) {
        this.f59810x5fe89c2d.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementObject_uid_list */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114234xa1b2d2f1(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f> collection) {
        this.f59810x5fe89c2d.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementScenes */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114235xa82c5623(java.util.Collection<java.lang.Integer> collection) {
        this.f59812xc9dff967.addAll(collection);
        return this;
    }

    /* renamed from: addElementObjectUidList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114236xe65c3d74(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f c27418xf09c770f) {
        this.f59810x5fe89c2d.add(c27418xf09c770f);
        return this;
    }

    /* renamed from: addElementObject_uid_list */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114237x9a606392(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f c27418xf09c770f) {
        this.f59810x5fe89c2d.add(c27418xf09c770f);
        return this;
    }

    /* renamed from: addElementScenes */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114238xc3b85c62(int i17) {
        this.f59812xc9dff967.add(java.lang.Integer.valueOf(i17));
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114239x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 c27395x12bf02c0 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0) fVar;
        return n51.f.a(this.f59803xca7c667e, c27395x12bf02c0.f59803xca7c667e) && n51.f.a(this.f59806x29f68d14, c27395x12bf02c0.f59806x29f68d14) && n51.f.a(this.f59810x5fe89c2d, c27395x12bf02c0.f59810x5fe89c2d) && n51.f.a(java.lang.Integer.valueOf(this.f59811x683188c), java.lang.Integer.valueOf(c27395x12bf02c0.f59811x683188c)) && n51.f.a(java.lang.Integer.valueOf(this.f59809xcf1cb234), java.lang.Integer.valueOf(c27395x12bf02c0.f59809xcf1cb234)) && n51.f.a(java.lang.Integer.valueOf(this.f59805xbe0ae6ac), java.lang.Integer.valueOf(c27395x12bf02c0.f59805xbe0ae6ac)) && n51.f.a(this.f59807x6b930ccf, c27395x12bf02c0.f59807x6b930ccf) && n51.f.a(this.f59804xfeb2f285, c27395x12bf02c0.f59804xfeb2f285) && n51.f.a(this.f59815xce7369d1, c27395x12bf02c0.f59815xce7369d1) && n51.f.a(this.f59812xc9dff967, c27395x12bf02c0.f59812xc9dff967) && n51.f.a(java.lang.Boolean.valueOf(this.f59808x9a1f7cc6), java.lang.Boolean.valueOf(c27395x12bf02c0.f59808x9a1f7cc6)) && n51.f.a(java.lang.Integer.valueOf(this.f59813xb659a745), java.lang.Integer.valueOf(c27395x12bf02c0.f59813xb659a745)) && n51.f.a(this.f59814x7452f9a9, c27395x12bf02c0.f59814x7452f9a9);
    }

    /* renamed from: getBaseRequest */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e m114240xa452ad48() {
        return this.f59803xca7c667e;
    }

    /* renamed from: getClientUserAgent */
    public java.lang.String m114241x2f2039() {
        return this.f59804xfeb2f285;
    }

    /* renamed from: getClient_user_agent */
    public java.lang.String m114242x51e779cf() {
        return this.f59804xfeb2f285;
    }

    /* renamed from: getCommentScene */
    public int m114243x8fadefe3() {
        return this.f59805xbe0ae6ac;
    }

    /* renamed from: getComment_scene */
    public int m114244x7b6aa2f6() {
        return this.f59805xbe0ae6ac;
    }

    /* renamed from: getFinderBasereq */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114245x65117971() {
        return this.f59806x29f68d14;
    }

    /* renamed from: getFinderUsername */
    public java.lang.String m114246x93d5ac12() {
        return this.f59807x6b930ccf;
    }

    /* renamed from: getFinder_basereq */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114247x188e5a0a() {
        return this.f59806x29f68d14;
    }

    /* renamed from: getFinder_username */
    public java.lang.String m114248x4ff4de99() {
        return this.f59807x6b930ccf;
    }

    /* renamed from: getIsRefresh */
    public boolean m114249x1d914b9b() {
        return this.f59808x9a1f7cc6;
    }

    /* renamed from: getIs_refresh */
    public boolean m114250x886034bc() {
        return this.f59808x9a1f7cc6;
    }

    /* renamed from: getLiveReportScene */
    public int m114251xbe6c30f6() {
        return this.f59809xcf1cb234;
    }

    /* renamed from: getLive_report_scene */
    public int m114252x2251397e() {
        return this.f59809xcf1cb234;
    }

    /* renamed from: getObjectUidList */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f> m114253xd39f9d19() {
        return this.f59810x5fe89c2d;
    }

    /* renamed from: getObject_uid_list */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f> m114254x444a6df7() {
        return this.f59810x5fe89c2d;
    }

    /* renamed from: getScene */
    public int m114255x7520bed6() {
        return this.f59811x683188c;
    }

    /* renamed from: getScenes */
    public java.util.LinkedList<java.lang.Integer> m114256x2ef71c5d() {
        return this.f59812xc9dff967;
    }

    /* renamed from: getTriggerScene */
    public int m114257x76a8382a() {
        return this.f59813xb659a745;
    }

    /* renamed from: getTrigger_scene */
    public int m114258x73b9638f() {
        return this.f59813xb659a745;
    }

    /* renamed from: getUserLocation */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation m114259xa47c8716() {
        return this.f59814x7452f9a9;
    }

    /* renamed from: getUser_location */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation m114260x31b2b5f3() {
        return this.f59814x7452f9a9;
    }

    /* renamed from: getUxinfo */
    public java.lang.String m114261x338a8cc7() {
        return this.f59815xce7369d1;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114262x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e c27383x2de60e5e = this.f59803xca7c667e;
            if (c27383x2de60e5e != null) {
                fVar.i(1, c27383x2de60e5e.mo75928xcd1e8d8());
                this.f59803xca7c667e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 c27394x1ee46258 = this.f59806x29f68d14;
            if (c27394x1ee46258 != null) {
                fVar.i(2, c27394x1ee46258.mo75928xcd1e8d8());
                this.f59806x29f68d14.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, this.f59810x5fe89c2d);
            fVar.e(4, this.f59811x683188c);
            fVar.e(5, this.f59809xcf1cb234);
            fVar.e(6, this.f59805xbe0ae6ac);
            java.lang.String str = this.f59807x6b930ccf;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f59804xfeb2f285;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f59815xce7369d1;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.g(10, 2, this.f59812xc9dff967);
            fVar.a(11, this.f59808x9a1f7cc6);
            fVar.e(12, this.f59813xb659a745);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation userLocation = this.f59814x7452f9a9;
            if (userLocation == null) {
                return 0;
            }
            fVar.i(13, userLocation.mo75928xcd1e8d8());
            this.f59814x7452f9a9.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e c27383x2de60e5e2 = this.f59803xca7c667e;
            int i18 = c27383x2de60e5e2 != null ? 0 + b36.f.i(1, c27383x2de60e5e2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 c27394x1ee462582 = this.f59806x29f68d14;
            if (c27394x1ee462582 != null) {
                i18 += b36.f.i(2, c27394x1ee462582.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 8, this.f59810x5fe89c2d) + b36.f.e(4, this.f59811x683188c) + b36.f.e(5, this.f59809xcf1cb234) + b36.f.e(6, this.f59805xbe0ae6ac);
            java.lang.String str4 = this.f59807x6b930ccf;
            if (str4 != null) {
                g17 += b36.f.j(7, str4);
            }
            java.lang.String str5 = this.f59804xfeb2f285;
            if (str5 != null) {
                g17 += b36.f.j(8, str5);
            }
            java.lang.String str6 = this.f59815xce7369d1;
            if (str6 != null) {
                g17 += b36.f.j(9, str6);
            }
            int g18 = g17 + b36.f.g(10, 2, this.f59812xc9dff967) + b36.f.a(11, this.f59808x9a1f7cc6) + b36.f.e(12, this.f59813xb659a745);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation userLocation2 = this.f59814x7452f9a9;
            return userLocation2 != null ? g18 + b36.f.i(13, userLocation2.mo75928xcd1e8d8()) : g18;
        }
        if (i17 == 2) {
            this.f59810x5fe89c2d.clear();
            this.f59812xc9dff967.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e c27383x2de60e5e3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e();
                    if (bArr != null && bArr.length > 0) {
                        c27383x2de60e5e3.mo11468x92b714fd(bArr);
                    }
                    this.f59803xca7c667e = c27383x2de60e5e3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 c27394x1ee462583 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258();
                    if (bArr2 != null && bArr2.length > 0) {
                        c27394x1ee462583.mo11468x92b714fd(bArr2);
                    }
                    this.f59806x29f68d14 = c27394x1ee462583;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f c27418xf09c770f = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f();
                    if (bArr3 != null && bArr3.length > 0) {
                        c27418xf09c770f.mo11468x92b714fd(bArr3);
                    }
                    this.f59810x5fe89c2d.add(c27418xf09c770f);
                }
                return 0;
            case 4:
                this.f59811x683188c = aVar2.g(intValue);
                return 0;
            case 5:
                this.f59809xcf1cb234 = aVar2.g(intValue);
                return 0;
            case 6:
                this.f59805xbe0ae6ac = aVar2.g(intValue);
                return 0;
            case 7:
                this.f59807x6b930ccf = aVar2.k(intValue);
                return 0;
            case 8:
                this.f59804xfeb2f285 = aVar2.k(intValue);
                return 0;
            case 9:
                this.f59815xce7369d1 = aVar2.k(intValue);
                return 0;
            case 10:
                this.f59812xc9dff967.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 11:
                this.f59808x9a1f7cc6 = aVar2.c(intValue);
                return 0;
            case 12:
                this.f59813xb659a745 = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation userLocation3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation();
                    if (bArr4 != null && bArr4.length > 0) {
                        userLocation3.mo11468x92b714fd(bArr4);
                    }
                    this.f59814x7452f9a9 = userLocation3;
                }
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBaseRequest */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114264x3ab820bc(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e c27383x2de60e5e) {
        this.f59803xca7c667e = c27383x2de60e5e;
        return this;
    }

    /* renamed from: setClientUserAgent */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114265x3705b9ad(java.lang.String str) {
        this.f59804xfeb2f285 = str;
        return this;
    }

    /* renamed from: setClient_user_agent */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114266x2d7d8643(java.lang.String str) {
        this.f59804xfeb2f285 = str;
        return this;
    }

    /* renamed from: setCommentScene */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114267xc5f6eaef(int i17) {
        this.f59805xbe0ae6ac = i17;
        return this;
    }

    /* renamed from: setComment_scene */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114268xe41096a(int i17) {
        this.f59805xbe0ae6ac = i17;
        return this;
    }

    /* renamed from: setFinderBasereq */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114269xf7e7dfe5(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 c27394x1ee46258) {
        this.f59806x29f68d14 = c27394x1ee46258;
        return this;
    }

    /* renamed from: setFinderUsername */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114270x5bcc141e(java.lang.String str) {
        this.f59807x6b930ccf = str;
        return this;
    }

    /* renamed from: setFinder_basereq */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114271xe084c216(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 c27394x1ee46258) {
        this.f59806x29f68d14 = c27394x1ee46258;
        return this;
    }

    /* renamed from: setFinder_username */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114272x86cb780d(java.lang.String str) {
        this.f59807x6b930ccf = str;
        return this;
    }

    /* renamed from: setIsRefresh */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114273x79e50c0f(boolean z17) {
        this.f59808x9a1f7cc6 = z17;
        return this;
    }

    /* renamed from: setIs_refresh */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114274xb68482c8(boolean z17) {
        this.f59808x9a1f7cc6 = z17;
        return this;
    }

    /* renamed from: setLiveReportScene */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114275xf542ca6a(int i17) {
        this.f59809xcf1cb234 = i17;
        return this;
    }

    /* renamed from: setLive_report_scene */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114276xfde745f2(int i17) {
        this.f59809xcf1cb234 = i17;
        return this;
    }

    /* renamed from: setObjectUidList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114277x6676038d(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f> linkedList) {
        this.f59810x5fe89c2d = linkedList;
        return this;
    }

    /* renamed from: setObject_uid_list */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114278x7b21076b(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27418xf09c770f> linkedList) {
        this.f59810x5fe89c2d = linkedList;
        return this;
    }

    /* renamed from: setScene */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114279x53aed94a(int i17) {
        this.f59811x683188c = i17;
        return this;
    }

    /* renamed from: setScenes */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114280x222c5069(java.util.LinkedList<java.lang.Integer> linkedList) {
        this.f59812xc9dff967 = linkedList;
        return this;
    }

    /* renamed from: setTriggerScene */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114281xacf13336(int i17) {
        this.f59813xb659a745 = i17;
        return this;
    }

    /* renamed from: setTrigger_scene */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114282x68fca03(int i17) {
        this.f59813xb659a745 = i17;
        return this;
    }

    /* renamed from: setUserLocation */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114283xdac58222(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation userLocation) {
        this.f59814x7452f9a9 = userLocation;
        return this;
    }

    /* renamed from: setUser_location */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114284xc4891c67(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0.UserLocation userLocation) {
        this.f59814x7452f9a9 = userLocation;
        return this;
    }

    /* renamed from: setUxinfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114285x26bfc0d3(java.lang.String str) {
        this.f59815xce7369d1 = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 m114263x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0) super.mo11468x92b714fd(bArr);
    }
}
