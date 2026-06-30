package io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173;

/* renamed from: io.flutter.plugins.sharedpreferences.Messages */
/* loaded from: classes11.dex */
public class C28769xe84f656c {

    /* renamed from: io.flutter.plugins.sharedpreferences.Messages$FlutterError */
    /* loaded from: classes11.dex */
    public static class FlutterError extends java.lang.RuntimeException {

        /* renamed from: code */
        public final java.lang.String f71972x2eaded;

        /* renamed from: details */
        public final java.lang.Object f71973x5cd8f242;

        public FlutterError(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
            super(str2);
            this.f71972x2eaded = str;
            this.f71973x5cd8f242 = obj;
        }
    }

    /* renamed from: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi */
    /* loaded from: classes16.dex */
    public interface SharedPreferencesApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m138916x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m138917x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, sharedPreferencesApi.mo138928xc84af884((java.lang.String) ((java.util.ArrayList) obj).get(0)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.m138915xfc72afde(th6);
            }
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$1 */
        static /* synthetic */ void m138918x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.mo138929x76486a6c((java.lang.String) arrayList2.get(0), (java.lang.Boolean) arrayList2.get(1)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.m138915xfc72afde(th6);
            }
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$2 */
        static /* synthetic */ void m138919x9c0e7fee(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.mo138932x2321b713((java.lang.String) arrayList2.get(0), (java.lang.String) arrayList2.get(1)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.m138915xfc72afde(th6);
            }
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$3 */
        static /* synthetic */ void m138920x9c0e7fef(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.String str = (java.lang.String) arrayList2.get(0);
            java.lang.Number number = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.m138915xfc72afde(th6);
                }
            }
            arrayList.add(0, sharedPreferencesApi.mo138931xca02702d(str, valueOf));
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$4 */
        static /* synthetic */ void m138921x9c0e7ff0(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.mo138930x943d2d3((java.lang.String) arrayList2.get(0), (java.lang.Double) arrayList2.get(1)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.m138915xfc72afde(th6);
            }
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$5 */
        static /* synthetic */ void m138922x9c0e7ff1(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.mo138933xbe9e1a51((java.lang.String) arrayList2.get(0), (java.util.List) arrayList2.get(1)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.m138915xfc72afde(th6);
            }
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$6 */
        static /* synthetic */ void m138923x9c0e7ff2(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.mo138926x5a5b64d((java.lang.String) arrayList2.get(0), (java.util.List) arrayList2.get(1)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.m138915xfc72afde(th6);
            }
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$7 */
        static /* synthetic */ void m138924x9c0e7ff3(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.mo138927xb5882a6b((java.lang.String) arrayList2.get(0), (java.util.List) arrayList2.get(1)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.m138915xfc72afde(th6);
            }
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m138925x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi sharedPreferencesApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.SharedPreferencesApi.remove", m138916x7444b660(), interfaceC28679x1b8c77f2.m138409xc4e54c30());
            if (sharedPreferencesApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.m138917x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.SharedPreferencesApi.setBool", m138916x7444b660(), interfaceC28679x1b8c77f2.m138409xc4e54c30());
            if (sharedPreferencesApi != null) {
                c28677x2598ceaa2.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$b
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.m138918x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa2.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa3 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.SharedPreferencesApi.setString", m138916x7444b660(), interfaceC28679x1b8c77f2.m138409xc4e54c30());
            if (sharedPreferencesApi != null) {
                c28677x2598ceaa3.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$c
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.m138919x9c0e7fee(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa3.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa4 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.SharedPreferencesApi.setInt", m138916x7444b660(), interfaceC28679x1b8c77f2.m138409xc4e54c30());
            if (sharedPreferencesApi != null) {
                c28677x2598ceaa4.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$d
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.m138920x9c0e7fef(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa4.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa5 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.SharedPreferencesApi.setDouble", m138916x7444b660(), interfaceC28679x1b8c77f2.m138409xc4e54c30());
            if (sharedPreferencesApi != null) {
                c28677x2598ceaa5.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$e
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.m138921x9c0e7ff0(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa5.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa6 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.SharedPreferencesApi.setStringList", m138916x7444b660(), interfaceC28679x1b8c77f2.m138409xc4e54c30());
            if (sharedPreferencesApi != null) {
                c28677x2598ceaa6.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$f
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.m138922x9c0e7ff1(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa6.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa7 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.SharedPreferencesApi.clear", m138916x7444b660(), interfaceC28679x1b8c77f2.m138409xc4e54c30());
            if (sharedPreferencesApi != null) {
                c28677x2598ceaa7.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$g
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.m138923x9c0e7ff2(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa7.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa8 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.SharedPreferencesApi.getAll", m138916x7444b660(), interfaceC28679x1b8c77f2.m138409xc4e54c30());
            if (sharedPreferencesApi != null) {
                c28677x2598ceaa8.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$h
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.m138924x9c0e7ff3(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa8.m138404x12ef5e45(null);
            }
        }

        /* renamed from: clear */
        java.lang.Boolean mo138926x5a5b64d(java.lang.String str, java.util.List<java.lang.String> list);

        /* renamed from: getAll */
        java.util.Map<java.lang.String, java.lang.Object> mo138927xb5882a6b(java.lang.String str, java.util.List<java.lang.String> list);

        /* renamed from: remove */
        java.lang.Boolean mo138928xc84af884(java.lang.String str);

        /* renamed from: setBool */
        java.lang.Boolean mo138929x76486a6c(java.lang.String str, java.lang.Boolean bool);

        /* renamed from: setDouble */
        java.lang.Boolean mo138930x943d2d3(java.lang.String str, java.lang.Double d17);

        /* renamed from: setInt */
        java.lang.Boolean mo138931xca02702d(java.lang.String str, java.lang.Long l17);

        /* renamed from: setString */
        java.lang.Boolean mo138932x2321b713(java.lang.String str, java.lang.String str2);

        /* renamed from: setStringList */
        java.lang.Boolean mo138933xbe9e1a51(java.lang.String str, java.util.List<java.lang.String> list);
    }

    /* renamed from: wrapError */
    public static java.util.ArrayList<java.lang.Object> m138915xfc72afde(java.lang.Throwable th6) {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(3);
        if (th6 instanceof io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.FlutterError) {
            io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.FlutterError flutterError = (io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.FlutterError) th6;
            arrayList.add(flutterError.f71972x2eaded);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.f71973x5cd8f242);
        } else {
            arrayList.add(th6.toString());
            arrayList.add(th6.getClass().getSimpleName());
            arrayList.add("Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
        }
        return arrayList;
    }
}
