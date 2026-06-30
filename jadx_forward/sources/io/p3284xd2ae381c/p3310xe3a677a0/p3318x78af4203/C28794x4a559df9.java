package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView */
/* loaded from: classes16.dex */
public class C28794x4a559df9 {

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$ConsoleMessage */
    /* loaded from: classes13.dex */
    public static final class ConsoleMessage {

        /* renamed from: level */
        private io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessageLevel f72005x6219b84;

        /* renamed from: lineNumber */
        private java.lang.Long f72006xec61b05d;

        /* renamed from: message */
        private java.lang.String f72007x38eb0007;

        /* renamed from: sourceId */
        private java.lang.String f72008x6816d696;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$ConsoleMessage$Builder */
        /* loaded from: classes13.dex */
        public static final class Builder {

            /* renamed from: level */
            private io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessageLevel f72009x6219b84;

            /* renamed from: lineNumber */
            private java.lang.Long f72010xec61b05d;

            /* renamed from: message */
            private java.lang.String f72011x38eb0007;

            /* renamed from: sourceId */
            private java.lang.String f72012x6816d696;

            /* renamed from: build */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage m138978x59bc66e() {
                io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage consoleMessage = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage();
                consoleMessage.m138974x8c6b65f(this.f72010xec61b05d);
                consoleMessage.m138975xea298945(this.f72011x38eb0007);
                consoleMessage.m138973x534d5c42(this.f72009x6219b84);
                consoleMessage.m138976xdea97518(this.f72012x6816d696);
                return consoleMessage;
            }

            /* renamed from: setLevel */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage.Builder m138979x534d5c42(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessageLevel consoleMessageLevel) {
                this.f72009x6219b84 = consoleMessageLevel;
                return this;
            }

            /* renamed from: setLineNumber */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage.Builder m138980x8c6b65f(java.lang.Long l17) {
                this.f72010xec61b05d = l17;
                return this;
            }

            /* renamed from: setMessage */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage.Builder m138981xea298945(java.lang.String str) {
                this.f72011x38eb0007 = str;
                return this;
            }

            /* renamed from: setSourceId */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage.Builder m138982xdea97518(java.lang.String str) {
                this.f72012x6816d696 = str;
                return this;
            }
        }

        /* renamed from: fromList */
        public static io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage m138968xb5cc5768(java.util.ArrayList<java.lang.Object> arrayList) {
            java.lang.Long valueOf;
            io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage consoleMessage = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage();
            java.lang.Object obj = arrayList.get(0);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = java.lang.Long.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : ((java.lang.Long) obj).longValue());
            }
            consoleMessage.m138974x8c6b65f(valueOf);
            consoleMessage.m138975xea298945((java.lang.String) arrayList.get(1));
            consoleMessage.m138973x534d5c42(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessageLevel.m138986xcee59d22()[((java.lang.Integer) arrayList.get(2)).intValue()]);
            consoleMessage.m138976xdea97518((java.lang.String) arrayList.get(3));
            return consoleMessage;
        }

        /* renamed from: getLevel */
        public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessageLevel m138969x74bf41ce() {
            return this.f72005x6219b84;
        }

        /* renamed from: getLineNumber */
        public java.lang.Long m138970xdaa26853() {
            return this.f72006xec61b05d;
        }

        /* renamed from: getMessage */
        public java.lang.String m138971x76b83bd1() {
            return this.f72007x38eb0007;
        }

        /* renamed from: getSourceId */
        public java.lang.String m138972xe3f1140c() {
            return this.f72008x6816d696;
        }

        /* renamed from: setLevel */
        public void m138973x534d5c42(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessageLevel consoleMessageLevel) {
            if (consoleMessageLevel == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"level\" is null.");
            }
            this.f72005x6219b84 = consoleMessageLevel;
        }

        /* renamed from: setLineNumber */
        public void m138974x8c6b65f(java.lang.Long l17) {
            if (l17 == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"lineNumber\" is null.");
            }
            this.f72006xec61b05d = l17;
        }

        /* renamed from: setMessage */
        public void m138975xea298945(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"message\" is null.");
            }
            this.f72007x38eb0007 = str;
        }

        /* renamed from: setSourceId */
        public void m138976xdea97518(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"sourceId\" is null.");
            }
            this.f72008x6816d696 = str;
        }

        /* renamed from: toList */
        public java.util.ArrayList<java.lang.Object> m138977xcc327db9() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(4);
            arrayList.add(this.f72006xec61b05d);
            arrayList.add(this.f72007x38eb0007);
            io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessageLevel consoleMessageLevel = this.f72005x6219b84;
            arrayList.add(consoleMessageLevel == null ? null : java.lang.Integer.valueOf(consoleMessageLevel.f72018x5fb28d2));
            arrayList.add(this.f72008x6816d696);
            return arrayList;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$ConsoleMessageLevel */
    /* loaded from: classes13.dex */
    public enum ConsoleMessageLevel {
        DEBUG(0),
        ERROR(1),
        LOG(2),
        TIP(3),
        WARNING(4),
        UNKNOWN(5);


        /* renamed from: index */
        final int f72018x5fb28d2;

        ConsoleMessageLevel(int i17) {
            this.f72018x5fb28d2 = i17;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CookieManagerHostApi */
    /* loaded from: classes16.dex */
    public interface CookieManagerHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m138987x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m138988x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi cookieManagerHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            cookieManagerHostApi.mo138942x68b3d1fa(valueOf);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$1 */
        static /* synthetic */ void m138989x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi cookieManagerHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            java.lang.String str2 = (java.lang.String) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            cookieManagerHostApi.mo138945x78c6166(valueOf, str, str2);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$2 */
        static /* synthetic */ void m138990x9c0e7fee(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi cookieManagerHostApi, java.lang.Object obj, final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            cookieManagerHostApi.mo138943xc95e7952(number == null ? null : java.lang.Long.valueOf(number.longValue()), new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.Result<java.lang.Boolean>() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi.1
                @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.Result
                /* renamed from: error */
                public void mo138993x5c4d208(java.lang.Throwable th6) {
                    reply.mo84787x67612ea(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6));
                }

                @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.Result
                /* renamed from: success, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public void mo138994x90b54003(java.lang.Boolean bool) {
                    arrayList.add(0, bool);
                    reply.mo84787x67612ea(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$3 */
        static /* synthetic */ void m138991x9c0e7fef(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi cookieManagerHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            cookieManagerHostApi.mo138944x8c9250e6(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()), bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m138992x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi cookieManagerHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.attachInstance", m138987x7444b660());
            if (cookieManagerHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CookieManagerHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi.m138988x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.setCookie", m138987x7444b660());
            if (cookieManagerHostApi != null) {
                c28677x2598ceaa2.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CookieManagerHostApi$$b
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi.m138989x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa2.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa3 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.removeAllCookies", m138987x7444b660());
            if (cookieManagerHostApi != null) {
                c28677x2598ceaa3.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CookieManagerHostApi$$c
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi.m138990x9c0e7fee(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa3.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa4 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.setAcceptThirdPartyCookies", m138987x7444b660());
            if (cookieManagerHostApi != null) {
                c28677x2598ceaa4.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CookieManagerHostApi$$d
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi.m138991x9c0e7fef(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa4.m138404x12ef5e45(null);
            }
        }

        /* renamed from: attachInstance */
        void mo138942x68b3d1fa(java.lang.Long l17);

        /* renamed from: removeAllCookies */
        void mo138943xc95e7952(java.lang.Long l17, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.Result<java.lang.Boolean> result);

        /* renamed from: setAcceptThirdPartyCookies */
        void mo138944x8c9250e6(java.lang.Long l17, java.lang.Long l18, java.lang.Boolean bool);

        /* renamed from: setCookie */
        void mo138945x78c6166(java.lang.Long l17, java.lang.String str, java.lang.String str2);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CustomViewCallbackFlutterApi */
    /* loaded from: classes16.dex */
    public static class CustomViewCallbackFlutterApi {

        /* renamed from: binaryMessenger */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72021x56f9c012;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CustomViewCallbackFlutterApi$Reply */
        /* loaded from: classes16.dex */
        public interface Reply<T> {
            /* renamed from: reply */
            void mo138998x67612ea(T t17);
        }

        public CustomViewCallbackFlutterApi(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
            this.f72021x56f9c012 = interfaceC28679x1b8c77f2;
        }

        /* renamed from: getCodec */
        public static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m138995x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* renamed from: create */
        public void m138997xaf65a0fc(java.lang.Long l17, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CustomViewCallbackFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72021x56f9c012, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallbackFlutterApi.create", m138995x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CustomViewCallbackFlutterApi$$a
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CustomViewCallbackFlutterApi.Reply.this.mo138998x67612ea(null);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CustomViewCallbackHostApi */
    /* loaded from: classes16.dex */
    public interface CustomViewCallbackHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m138999x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m139000x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CustomViewCallbackHostApi customViewCallbackHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            customViewCallbackHostApi.mo138951x3887b6ff(valueOf);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m139001x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CustomViewCallbackHostApi customViewCallbackHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallbackHostApi.onCustomViewHidden", m138999x7444b660());
            if (customViewCallbackHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CustomViewCallbackHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CustomViewCallbackHostApi.m139000x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CustomViewCallbackHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
        }

        /* renamed from: onCustomViewHidden */
        void mo138951x3887b6ff(java.lang.Long l17);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$DownloadListenerFlutterApi */
    /* loaded from: classes16.dex */
    public static class DownloadListenerFlutterApi {

        /* renamed from: binaryMessenger */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72022x56f9c012;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$DownloadListenerFlutterApi$Reply */
        /* loaded from: classes16.dex */
        public interface Reply<T> {
            /* renamed from: reply */
            void mo138958x67612ea(T t17);
        }

        public DownloadListenerFlutterApi(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
            this.f72022x56f9c012 = interfaceC28679x1b8c77f2;
        }

        /* renamed from: getCodec */
        public static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139002x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* renamed from: onDownloadStart */
        public void m139004x344c051b(java.lang.Long l17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l18, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.DownloadListenerFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72022x56f9c012, "dev.flutter.pigeon.webview_flutter_android.DownloadListenerFlutterApi.onDownloadStart", m139002x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, str, str2, str3, str4, l18)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$DownloadListenerFlutterApi$$a
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.DownloadListenerFlutterApi.Reply.this.mo138958x67612ea(null);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$DownloadListenerHostApi */
    /* loaded from: classes16.dex */
    public interface DownloadListenerHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139005x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m139006x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.DownloadListenerHostApi downloadListenerHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            downloadListenerHostApi.mo138957xaf65a0fc(valueOf);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m139007x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.DownloadListenerHostApi downloadListenerHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.DownloadListenerHostApi.create", m139005x7444b660());
            if (downloadListenerHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$DownloadListenerHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.DownloadListenerHostApi.m139006x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.DownloadListenerHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
        }

        /* renamed from: create */
        void mo138957xaf65a0fc(java.lang.Long l17);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$FileChooserMode */
    /* loaded from: classes16.dex */
    public enum FileChooserMode {
        OPEN(0),
        OPEN_MULTIPLE(1),
        SAVE(2);


        /* renamed from: index */
        final int f72027x5fb28d2;

        FileChooserMode(int i17) {
            this.f72027x5fb28d2 = i17;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$FileChooserParamsFlutterApi */
    /* loaded from: classes16.dex */
    public static class FileChooserParamsFlutterApi {

        /* renamed from: binaryMessenger */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72028x56f9c012;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$FileChooserParamsFlutterApi$Reply */
        /* loaded from: classes16.dex */
        public interface Reply<T> {
            /* renamed from: reply */
            void mo139015x67612ea(T t17);
        }

        public FileChooserParamsFlutterApi(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
            this.f72028x56f9c012 = interfaceC28679x1b8c77f2;
        }

        /* renamed from: getCodec */
        public static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139012x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* renamed from: create */
        public void m139014xaf65a0fc(java.lang.Long l17, java.lang.Boolean bool, java.util.List<java.lang.String> list, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FileChooserMode fileChooserMode, java.lang.String str, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FileChooserParamsFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72028x56f9c012, "dev.flutter.pigeon.webview_flutter_android.FileChooserParamsFlutterApi.create", m139012x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, bool, list, java.lang.Integer.valueOf(fileChooserMode.f72027x5fb28d2), str)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$FileChooserParamsFlutterApi$$a
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FileChooserParamsFlutterApi.Reply.this.mo139015x67612ea(null);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$FlutterAssetManagerHostApi */
    /* loaded from: classes16.dex */
    public interface FlutterAssetManagerHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139016x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m139017x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FlutterAssetManagerHostApi flutterAssetManagerHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, flutterAssetManagerHostApi.mo138966x32b09e((java.lang.String) ((java.util.ArrayList) obj).get(0)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
            }
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$1 */
        static /* synthetic */ void m139018x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FlutterAssetManagerHostApi flutterAssetManagerHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, flutterAssetManagerHostApi.mo138965xa4fdae7d((java.lang.String) ((java.util.ArrayList) obj).get(0)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
            }
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m139019x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FlutterAssetManagerHostApi flutterAssetManagerHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManagerHostApi.list", m139016x7444b660());
            if (flutterAssetManagerHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$FlutterAssetManagerHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FlutterAssetManagerHostApi.m139017x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FlutterAssetManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManagerHostApi.getAssetFilePathByName", m139016x7444b660());
            if (flutterAssetManagerHostApi != null) {
                c28677x2598ceaa2.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$FlutterAssetManagerHostApi$$b
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FlutterAssetManagerHostApi.m139018x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FlutterAssetManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa2.m138404x12ef5e45(null);
            }
        }

        /* renamed from: getAssetFilePathByName */
        java.lang.String mo138965xa4fdae7d(java.lang.String str);

        /* renamed from: list */
        java.util.List<java.lang.String> mo138966x32b09e(java.lang.String str);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$FlutterError */
    /* loaded from: classes15.dex */
    public static class FlutterError extends java.lang.RuntimeException {

        /* renamed from: code */
        public final java.lang.String f72029x2eaded;

        /* renamed from: details */
        public final java.lang.Object f72030x5cd8f242;

        public FlutterError(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
            super(str2);
            this.f72029x2eaded = str;
            this.f72030x5cd8f242 = obj;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$GeolocationPermissionsCallbackFlutterApi */
    /* loaded from: classes16.dex */
    public static class GeolocationPermissionsCallbackFlutterApi {

        /* renamed from: binaryMessenger */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72031x56f9c012;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$GeolocationPermissionsCallbackFlutterApi$Reply */
        /* loaded from: classes16.dex */
        public interface Reply<T> {
            /* renamed from: reply */
            void mo139023x67612ea(T t17);
        }

        public GeolocationPermissionsCallbackFlutterApi(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
            this.f72031x56f9c012 = interfaceC28679x1b8c77f2;
        }

        /* renamed from: getCodec */
        public static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139020x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* renamed from: create */
        public void m139022xaf65a0fc(java.lang.Long l17, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.GeolocationPermissionsCallbackFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72031x56f9c012, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallbackFlutterApi.create", m139020x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$GeolocationPermissionsCallbackFlutterApi$$a
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.GeolocationPermissionsCallbackFlutterApi.Reply.this.mo139023x67612ea(null);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$GeolocationPermissionsCallbackHostApi */
    /* loaded from: classes16.dex */
    public interface GeolocationPermissionsCallbackHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139024x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m139025x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.GeolocationPermissionsCallbackHostApi geolocationPermissionsCallbackHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(2);
            java.lang.Boolean bool2 = (java.lang.Boolean) arrayList2.get(3);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            geolocationPermissionsCallbackHostApi.mo139027xb9724478(valueOf, str, bool, bool2);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m139026x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.GeolocationPermissionsCallbackHostApi geolocationPermissionsCallbackHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallbackHostApi.invoke", m139024x7444b660());
            if (geolocationPermissionsCallbackHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$GeolocationPermissionsCallbackHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.GeolocationPermissionsCallbackHostApi.m139025x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.GeolocationPermissionsCallbackHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
        }

        /* renamed from: invoke */
        void mo139027xb9724478(java.lang.Long l17, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$HttpAuthHandlerFlutterApi */
    /* loaded from: classes16.dex */
    public static class HttpAuthHandlerFlutterApi {

        /* renamed from: binaryMessenger */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72032x56f9c012;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$HttpAuthHandlerFlutterApi$Reply */
        /* loaded from: classes16.dex */
        public interface Reply<T> {
            /* renamed from: reply */
            void mo139031x67612ea(T t17);
        }

        public HttpAuthHandlerFlutterApi(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
            this.f72032x56f9c012 = interfaceC28679x1b8c77f2;
        }

        /* renamed from: getCodec */
        public static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139028x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* renamed from: create */
        public void m139030xaf65a0fc(java.lang.Long l17, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72032x56f9c012, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerFlutterApi.create", m139028x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$HttpAuthHandlerFlutterApi$$a
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerFlutterApi.Reply.this.mo139031x67612ea(null);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$HttpAuthHandlerHostApi */
    /* loaded from: classes16.dex */
    public interface HttpAuthHandlerHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139032x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m139033x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi httpAuthHandlerHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            arrayList.add(0, httpAuthHandlerHostApi.mo139039xe7ba70a8(valueOf));
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$1 */
        static /* synthetic */ void m139034x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi httpAuthHandlerHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            httpAuthHandlerHostApi.mo139037xae7a2e7a(valueOf);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$2 */
        static /* synthetic */ void m139035x9c0e7fee(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi httpAuthHandlerHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            java.lang.String str2 = (java.lang.String) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            httpAuthHandlerHostApi.mo139038xed8d1cae(valueOf, str, str2);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m139036x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi httpAuthHandlerHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.useHttpAuthUsernamePassword", m139032x7444b660());
            if (httpAuthHandlerHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$HttpAuthHandlerHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi.m139033x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.cancel", m139032x7444b660());
            if (httpAuthHandlerHostApi != null) {
                c28677x2598ceaa2.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$HttpAuthHandlerHostApi$$b
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi.m139034x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa2.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa3 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.proceed", m139032x7444b660());
            if (httpAuthHandlerHostApi != null) {
                c28677x2598ceaa3.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$HttpAuthHandlerHostApi$$c
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi.m139035x9c0e7fee(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa3.m138404x12ef5e45(null);
            }
        }

        /* renamed from: cancel */
        void mo139037xae7a2e7a(java.lang.Long l17);

        /* renamed from: proceed */
        void mo139038xed8d1cae(java.lang.Long l17, java.lang.String str, java.lang.String str2);

        /* renamed from: useHttpAuthUsernamePassword */
        java.lang.Boolean mo139039xe7ba70a8(java.lang.Long l17);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$InstanceManagerHostApi */
    /* loaded from: classes16.dex */
    public interface InstanceManagerHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139040x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m139041x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.InstanceManagerHostApi instanceManagerHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                instanceManagerHostApi.mo139043x5a5b64d();
                arrayList.add(0, null);
            } catch (java.lang.Throwable th6) {
                arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
            }
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m139042x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.InstanceManagerHostApi instanceManagerHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.InstanceManagerHostApi.clear", m139040x7444b660());
            if (instanceManagerHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$InstanceManagerHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.InstanceManagerHostApi.m139041x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.InstanceManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
        }

        /* renamed from: clear */
        void mo139043x5a5b64d();
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaObjectFlutterApi */
    /* loaded from: classes16.dex */
    public static class JavaObjectFlutterApi {

        /* renamed from: binaryMessenger */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72033x56f9c012;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaObjectFlutterApi$Reply */
        /* loaded from: classes16.dex */
        public interface Reply<T> {
            /* renamed from: reply */
            void mo139047x67612ea(T t17);
        }

        public JavaObjectFlutterApi(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
            this.f72033x56f9c012 = interfaceC28679x1b8c77f2;
        }

        /* renamed from: getCodec */
        public static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139044x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* renamed from: dispose */
        public void m139046x63a5261f(java.lang.Long l17, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaObjectFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72033x56f9c012, "dev.flutter.pigeon.webview_flutter_android.JavaObjectFlutterApi.dispose", m139044x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaObjectFlutterApi$$a
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaObjectFlutterApi.Reply.this.mo139047x67612ea(null);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaObjectHostApi */
    /* loaded from: classes16.dex */
    public interface JavaObjectHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139048x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m139049x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaObjectHostApi javaObjectHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            javaObjectHostApi.mo139051x63a5261f(valueOf);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m139050x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaObjectHostApi javaObjectHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.JavaObjectHostApi.dispose", m139048x7444b660());
            if (javaObjectHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaObjectHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaObjectHostApi.m139049x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaObjectHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
        }

        /* renamed from: dispose */
        void mo139051x63a5261f(java.lang.Long l17);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaScriptChannelFlutterApi */
    /* loaded from: classes16.dex */
    public static class JavaScriptChannelFlutterApi {

        /* renamed from: binaryMessenger */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72034x56f9c012;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaScriptChannelFlutterApi$Reply */
        /* loaded from: classes16.dex */
        public interface Reply<T> {
            /* renamed from: reply */
            void mo139055x67612ea(T t17);
        }

        public JavaScriptChannelFlutterApi(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
            this.f72034x56f9c012 = interfaceC28679x1b8c77f2;
        }

        /* renamed from: getCodec */
        public static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139052x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* renamed from: postMessage */
        public void m139054x58d00b47(java.lang.Long l17, java.lang.String str, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaScriptChannelFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72034x56f9c012, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannelFlutterApi.postMessage", m139052x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, str)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaScriptChannelFlutterApi$$a
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaScriptChannelFlutterApi.Reply.this.mo139055x67612ea(null);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaScriptChannelHostApi */
    /* loaded from: classes16.dex */
    public interface JavaScriptChannelHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139056x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m139057x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaScriptChannelHostApi javaScriptChannelHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            javaScriptChannelHostApi.mo139059xaf65a0fc(valueOf, str);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m139058x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaScriptChannelHostApi javaScriptChannelHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannelHostApi.create", m139056x7444b660());
            if (javaScriptChannelHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaScriptChannelHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaScriptChannelHostApi.m139057x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaScriptChannelHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
        }

        /* renamed from: create */
        void mo139059xaf65a0fc(java.lang.Long l17, java.lang.String str);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$PermissionRequestFlutterApi */
    /* loaded from: classes16.dex */
    public static class PermissionRequestFlutterApi {

        /* renamed from: binaryMessenger */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72035x56f9c012;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$PermissionRequestFlutterApi$Reply */
        /* loaded from: classes16.dex */
        public interface Reply<T> {
            /* renamed from: reply */
            void mo139063x67612ea(T t17);
        }

        public PermissionRequestFlutterApi(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
            this.f72035x56f9c012 = interfaceC28679x1b8c77f2;
        }

        /* renamed from: getCodec */
        public static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139060x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* renamed from: create */
        public void m139062xaf65a0fc(java.lang.Long l17, java.util.List<java.lang.String> list, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72035x56f9c012, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestFlutterApi.create", m139060x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, list)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$PermissionRequestFlutterApi$$a
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestFlutterApi.Reply.this.mo139063x67612ea(null);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$PermissionRequestHostApi */
    /* loaded from: classes16.dex */
    public interface PermissionRequestHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139064x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m139065x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestHostApi permissionRequestHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.util.List<java.lang.String> list = (java.util.List) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            permissionRequestHostApi.mo139069x5e0c11c(valueOf, list);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$1 */
        static /* synthetic */ void m139066x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestHostApi permissionRequestHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            permissionRequestHostApi.mo139068x2efe0c(valueOf);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m139067x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestHostApi permissionRequestHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestHostApi.grant", m139064x7444b660());
            if (permissionRequestHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$PermissionRequestHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestHostApi.m139065x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestHostApi.deny", m139064x7444b660());
            if (permissionRequestHostApi != null) {
                c28677x2598ceaa2.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$PermissionRequestHostApi$$b
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestHostApi.m139066x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa2.m138404x12ef5e45(null);
            }
        }

        /* renamed from: deny */
        void mo139068x2efe0c(java.lang.Long l17);

        /* renamed from: grant */
        void mo139069x5e0c11c(java.lang.Long l17, java.util.List<java.lang.String> list);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$Result */
    /* loaded from: classes13.dex */
    public interface Result<T> {
        /* renamed from: error */
        void mo138993x5c4d208(java.lang.Throwable th6);

        /* renamed from: success */
        void mo138994x90b54003(T t17);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$ViewFlutterApi */
    /* loaded from: classes16.dex */
    public static class ViewFlutterApi {

        /* renamed from: binaryMessenger */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72036x56f9c012;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$ViewFlutterApi$Reply */
        /* loaded from: classes16.dex */
        public interface Reply<T> {
            /* renamed from: reply */
            void mo139073x67612ea(T t17);
        }

        public ViewFlutterApi(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
            this.f72036x56f9c012 = interfaceC28679x1b8c77f2;
        }

        /* renamed from: getCodec */
        public static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139070x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* renamed from: create */
        public void m139072xaf65a0fc(java.lang.Long l17, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ViewFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72036x56f9c012, "dev.flutter.pigeon.webview_flutter_android.ViewFlutterApi.create", m139070x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$ViewFlutterApi$$a
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ViewFlutterApi.Reply.this.mo139073x67612ea(null);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi */
    /* loaded from: classes16.dex */
    public static class WebChromeClientFlutterApi {

        /* renamed from: binaryMessenger */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72037x56f9c012;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply */
        /* loaded from: classes16.dex */
        public interface Reply<T> {
            /* renamed from: reply */
            void mo139097x67612ea(T t17);
        }

        public WebChromeClientFlutterApi(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
            this.f72037x56f9c012 = interfaceC28679x1b8c77f2;
        }

        /* renamed from: getCodec */
        public static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139074x7444b660() {
            return io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApiCodec.f72038x4fbc8495;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onJsConfirm$9 */
        public static /* synthetic */ void m139080xed0abe90(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply reply, java.lang.Object obj) {
            reply.mo139097x67612ea((java.lang.Boolean) obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onJsPrompt$10 */
        public static /* synthetic */ void m139081xed628c9a(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply reply, java.lang.Object obj) {
            reply.mo139097x67612ea((java.lang.String) obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onShowFileChooser$1 */
        public static /* synthetic */ void m139085x1f01f873(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply reply, java.lang.Object obj) {
            reply.mo139097x67612ea((java.util.List) obj);
        }

        /* renamed from: onConsoleMessage */
        public void m139086x3424fa6f(java.lang.Long l17, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage consoleMessage, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72037x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onConsoleMessage", m139074x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, consoleMessage)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$k
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply.this.mo139097x67612ea(null);
                }
            });
        }

        /* renamed from: onGeolocationPermissionsHidePrompt */
        public void m139087xfdd89c83(java.lang.Long l17, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72037x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onGeolocationPermissionsHidePrompt", m139074x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$g
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply.this.mo139097x67612ea(null);
                }
            });
        }

        /* renamed from: onGeolocationPermissionsShowPrompt */
        public void m139088x179921fe(java.lang.Long l17, java.lang.Long l18, java.lang.String str, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72037x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onGeolocationPermissionsShowPrompt", m139074x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, str)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$e
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply.this.mo139097x67612ea(null);
                }
            });
        }

        /* renamed from: onHideCustomView */
        public void m139089x9cd05057(java.lang.Long l17, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72037x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onHideCustomView", m139074x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$f
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply.this.mo139097x67612ea(null);
                }
            });
        }

        /* renamed from: onJsAlert */
        public void m139090xfefe72b4(java.lang.Long l17, java.lang.String str, java.lang.String str2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72037x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsAlert", m139074x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, str, str2)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$b
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply.this.mo139097x67612ea(null);
                }
            });
        }

        /* renamed from: onJsConfirm */
        public void m139091xa890da18(java.lang.Long l17, java.lang.String str, java.lang.String str2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Boolean> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72037x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsConfirm", m139074x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, str, str2)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$d
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.m139080xed0abe90(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply.this, obj);
                }
            });
        }

        /* renamed from: onJsPrompt */
        public void m139092xfac19b0c(java.lang.Long l17, java.lang.String str, java.lang.String str2, java.lang.String str3, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.String> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72037x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsPrompt", m139074x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, str, str2, str3)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$c
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.m139081xed628c9a(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply.this, obj);
                }
            });
        }

        /* renamed from: onPermissionRequest */
        public void m139093xf4b139a1(java.lang.Long l17, java.lang.Long l18, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72037x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onPermissionRequest", m139074x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, l18)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$a
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply.this.mo139097x67612ea(null);
                }
            });
        }

        /* renamed from: onProgressChanged */
        public void m139094x95ed2be8(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72037x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onProgressChanged", m139074x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, l19)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$h
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply.this.mo139097x67612ea(null);
                }
            });
        }

        /* renamed from: onShowCustomView */
        public void m139095x2f8ba052(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72037x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onShowCustomView", m139074x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, l19)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$j
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply.this.mo139097x67612ea(null);
                }
            });
        }

        /* renamed from: onShowFileChooser */
        public void m139096xca5d5903(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.util.List<java.lang.String>> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72037x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onShowFileChooser", m139074x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, l19)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$i
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.m139085x1f01f873(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply.this, obj);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApiCodec */
    /* loaded from: classes13.dex */
    public static class WebChromeClientFlutterApiCodec extends io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc {

        /* renamed from: INSTANCE */
        public static final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApiCodec f72038x4fbc8495 = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApiCodec();

        private WebChromeClientFlutterApiCodec() {
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc
        /* renamed from: readValueOfType */
        public java.lang.Object mo84732x8819c70c(byte b17, java.nio.ByteBuffer byteBuffer) {
            return b17 != Byte.MIN_VALUE ? super.mo84732x8819c70c(b17, byteBuffer) : io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage.m138968xb5cc5768((java.util.ArrayList) m138458xbd1ad57b(byteBuffer));
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc
        /* renamed from: writeValue */
        public void mo84733xd98e5cd2(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.Object obj) {
            if (!(obj instanceof io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage)) {
                super.mo84733xd98e5cd2(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                mo84733xd98e5cd2(byteArrayOutputStream, ((io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage) obj).m138977xcc327db9());
            }
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApi */
    /* loaded from: classes16.dex */
    public interface WebChromeClientHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139099x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m139100x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi webChromeClientHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webChromeClientHostApi.mo139107xaf65a0fc(valueOf);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$1 */
        static /* synthetic */ void m139101x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi webChromeClientHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webChromeClientHostApi.mo139112xd21d2474(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$2 */
        static /* synthetic */ void m139102x9c0e7fee(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi webChromeClientHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webChromeClientHostApi.mo139108x76757cde(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$3 */
        static /* synthetic */ void m139103x9c0e7fef(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi webChromeClientHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webChromeClientHostApi.mo139109x82153f25(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$4 */
        static /* synthetic */ void m139104x9c0e7ff0(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi webChromeClientHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webChromeClientHostApi.mo139110xc1264e49(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$5 */
        static /* synthetic */ void m139105x9c0e7ff1(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi webChromeClientHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webChromeClientHostApi.mo139111xda845cbb(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m139106x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi webChromeClientHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.create", m139099x7444b660());
            if (webChromeClientHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi.m139100x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnShowFileChooser", m139099x7444b660());
            if (webChromeClientHostApi != null) {
                c28677x2598ceaa2.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApi$$b
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi.m139101x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa2.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa3 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnConsoleMessage", m139099x7444b660());
            if (webChromeClientHostApi != null) {
                c28677x2598ceaa3.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApi$$c
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi.m139102x9c0e7fee(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa3.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa4 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsAlert", m139099x7444b660());
            if (webChromeClientHostApi != null) {
                c28677x2598ceaa4.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApi$$d
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi.m139103x9c0e7fef(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa4.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa5 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsConfirm", m139099x7444b660());
            if (webChromeClientHostApi != null) {
                c28677x2598ceaa5.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApi$$e
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi.m139104x9c0e7ff0(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa5.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa6 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsPrompt", m139099x7444b660());
            if (webChromeClientHostApi != null) {
                c28677x2598ceaa6.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApi$$f
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi.m139105x9c0e7ff1(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa6.m138404x12ef5e45(null);
            }
        }

        /* renamed from: create */
        void mo139107xaf65a0fc(java.lang.Long l17);

        /* renamed from: setSynchronousReturnValueForOnConsoleMessage */
        void mo139108x76757cde(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setSynchronousReturnValueForOnJsAlert */
        void mo139109x82153f25(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setSynchronousReturnValueForOnJsConfirm */
        void mo139110xc1264e49(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setSynchronousReturnValueForOnJsPrompt */
        void mo139111xda845cbb(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setSynchronousReturnValueForOnShowFileChooser */
        void mo139112xd21d2474(java.lang.Long l17, java.lang.Boolean bool);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebResourceErrorData */
    /* loaded from: classes15.dex */
    public static final class WebResourceErrorData {

        /* renamed from: description */
        private java.lang.String f72039x993583fc;

        /* renamed from: errorCode */
        private java.lang.Long f72040x139cb015;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebResourceErrorData$Builder */
        /* loaded from: classes15.dex */
        public static final class Builder {

            /* renamed from: description */
            private java.lang.String f72041x993583fc;

            /* renamed from: errorCode */
            private java.lang.Long f72042x139cb015;

            /* renamed from: build */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData m139119x59bc66e() {
                io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData webResourceErrorData = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData();
                webResourceErrorData.m139117x6f5de1d3(this.f72042x139cb015);
                webResourceErrorData.m139116x9713e3a(this.f72041x993583fc);
                return webResourceErrorData;
            }

            /* renamed from: setDescription */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData.Builder m139120x9713e3a(java.lang.String str) {
                this.f72041x993583fc = str;
                return this;
            }

            /* renamed from: setErrorCode */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData.Builder m139121x6f5de1d3(java.lang.Long l17) {
                this.f72042x139cb015 = l17;
                return this;
            }
        }

        /* renamed from: fromList */
        public static io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData m139113xb5cc5768(java.util.ArrayList<java.lang.Object> arrayList) {
            java.lang.Long valueOf;
            io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData webResourceErrorData = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData();
            java.lang.Object obj = arrayList.get(0);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = java.lang.Long.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : ((java.lang.Long) obj).longValue());
            }
            webResourceErrorData.m139117x6f5de1d3(valueOf);
            webResourceErrorData.m139116x9713e3a((java.lang.String) arrayList.get(1));
            return webResourceErrorData;
        }

        /* renamed from: getDescription */
        public java.lang.String m139114x730bcac6() {
            return this.f72039x993583fc;
        }

        /* renamed from: getErrorCode */
        public java.lang.Long m139115x130a215f() {
            return this.f72040x139cb015;
        }

        /* renamed from: setDescription */
        public void m139116x9713e3a(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"description\" is null.");
            }
            this.f72039x993583fc = str;
        }

        /* renamed from: setErrorCode */
        public void m139117x6f5de1d3(java.lang.Long l17) {
            if (l17 == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"errorCode\" is null.");
            }
            this.f72040x139cb015 = l17;
        }

        /* renamed from: toList */
        public java.util.ArrayList<java.lang.Object> m139118xcc327db9() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(2);
            arrayList.add(this.f72040x139cb015);
            arrayList.add(this.f72039x993583fc);
            return arrayList;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebResourceRequestData */
    /* loaded from: classes15.dex */
    public static final class WebResourceRequestData {

        /* renamed from: hasGesture */
        private java.lang.Boolean f72043x74aa214f;

        /* renamed from: isForMainFrame */
        private java.lang.Boolean f72044xa25f36b5;

        /* renamed from: isRedirect */
        private java.lang.Boolean f72045xa2749f26;

        /* renamed from: method */
        private java.lang.String f72046xbfc5d0e1;

        /* renamed from: requestHeaders */
        private java.util.Map<java.lang.String, java.lang.String> f72047xc0c4e5f7;
        private java.lang.String url;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebResourceRequestData$Builder */
        /* loaded from: classes15.dex */
        public static final class Builder {

            /* renamed from: hasGesture */
            private java.lang.Boolean f72048x74aa214f;

            /* renamed from: isForMainFrame */
            private java.lang.Boolean f72049xa25f36b5;

            /* renamed from: isRedirect */
            private java.lang.Boolean f72050xa2749f26;

            /* renamed from: method */
            private java.lang.String f72051xbfc5d0e1;

            /* renamed from: requestHeaders */
            private java.util.Map<java.lang.String, java.lang.String> f72052xc0c4e5f7;
            private java.lang.String url;

            /* renamed from: build */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData m139136x59bc66e() {
                io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData webResourceRequestData = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData();
                webResourceRequestData.m139134xca029dad(this.url);
                webResourceRequestData.m139130x58ed6bb7(this.f72049xa25f36b5);
                webResourceRequestData.m139131xbed9a528(this.f72050xa2749f26);
                webResourceRequestData.m139129x910f2751(this.f72048x74aa214f);
                webResourceRequestData.m139132x181227e3(this.f72051xbfc5d0e1);
                webResourceRequestData.m139133x77531af9(this.f72052xc0c4e5f7);
                return webResourceRequestData;
            }

            /* renamed from: setHasGesture */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData.Builder m139137x910f2751(java.lang.Boolean bool) {
                this.f72048x74aa214f = bool;
                return this;
            }

            /* renamed from: setIsForMainFrame */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData.Builder m139138x58ed6bb7(java.lang.Boolean bool) {
                this.f72049xa25f36b5 = bool;
                return this;
            }

            /* renamed from: setIsRedirect */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData.Builder m139139xbed9a528(java.lang.Boolean bool) {
                this.f72050xa2749f26 = bool;
                return this;
            }

            /* renamed from: setMethod */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData.Builder m139140x181227e3(java.lang.String str) {
                this.f72051xbfc5d0e1 = str;
                return this;
            }

            /* renamed from: setRequestHeaders */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData.Builder m139141x77531af9(java.util.Map<java.lang.String, java.lang.String> map) {
                this.f72052xc0c4e5f7 = map;
                return this;
            }

            /* renamed from: setUrl */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData.Builder m139142xca029dad(java.lang.String str) {
                this.url = str;
                return this;
            }
        }

        /* renamed from: fromList */
        public static io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData m139122xb5cc5768(java.util.ArrayList<java.lang.Object> arrayList) {
            io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData webResourceRequestData = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData();
            webResourceRequestData.m139134xca029dad((java.lang.String) arrayList.get(0));
            webResourceRequestData.m139130x58ed6bb7((java.lang.Boolean) arrayList.get(1));
            webResourceRequestData.m139131xbed9a528((java.lang.Boolean) arrayList.get(2));
            webResourceRequestData.m139129x910f2751((java.lang.Boolean) arrayList.get(3));
            webResourceRequestData.m139132x181227e3((java.lang.String) arrayList.get(4));
            webResourceRequestData.m139133x77531af9((java.util.Map) arrayList.get(5));
            return webResourceRequestData;
        }

        /* renamed from: getHasGesture */
        public java.lang.Boolean m139123x62ead945() {
            return this.f72043x74aa214f;
        }

        /* renamed from: getIsForMainFrame */
        public java.lang.Boolean m139124x90f703ab() {
            return this.f72044xa25f36b5;
        }

        /* renamed from: getIsRedirect */
        public java.lang.Boolean m139125x90b5571c() {
            return this.f72045xa2749f26;
        }

        /* renamed from: getMethod */
        public java.lang.String m139126x24dcf3d7() {
            return this.f72046xbfc5d0e1;
        }

        /* renamed from: getRequestHeaders */
        public java.util.Map<java.lang.String, java.lang.String> m139127xaf5cb2ed() {
            return this.f72047xc0c4e5f7;
        }

        /* renamed from: getUrl */
        public java.lang.String m139128xb5887639() {
            return this.url;
        }

        /* renamed from: setHasGesture */
        public void m139129x910f2751(java.lang.Boolean bool) {
            if (bool == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"hasGesture\" is null.");
            }
            this.f72043x74aa214f = bool;
        }

        /* renamed from: setIsForMainFrame */
        public void m139130x58ed6bb7(java.lang.Boolean bool) {
            if (bool == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"isForMainFrame\" is null.");
            }
            this.f72044xa25f36b5 = bool;
        }

        /* renamed from: setIsRedirect */
        public void m139131xbed9a528(java.lang.Boolean bool) {
            this.f72045xa2749f26 = bool;
        }

        /* renamed from: setMethod */
        public void m139132x181227e3(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"method\" is null.");
            }
            this.f72046xbfc5d0e1 = str;
        }

        /* renamed from: setRequestHeaders */
        public void m139133x77531af9(java.util.Map<java.lang.String, java.lang.String> map) {
            if (map == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"requestHeaders\" is null.");
            }
            this.f72047xc0c4e5f7 = map;
        }

        /* renamed from: setUrl */
        public void m139134xca029dad(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"url\" is null.");
            }
            this.url = str;
        }

        /* renamed from: toList */
        public java.util.ArrayList<java.lang.Object> m139135xcc327db9() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(6);
            arrayList.add(this.url);
            arrayList.add(this.f72044xa25f36b5);
            arrayList.add(this.f72045xa2749f26);
            arrayList.add(this.f72043x74aa214f);
            arrayList.add(this.f72046xbfc5d0e1);
            arrayList.add(this.f72047xc0c4e5f7);
            return arrayList;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi */
    /* loaded from: classes16.dex */
    public interface WebSettingsHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139143x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m139144x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webSettingsHostApi.mo139160xaf65a0fc(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$1 */
        static /* synthetic */ void m139145x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webSettingsHostApi.mo139165xea71b9e6(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$10 */
        static /* synthetic */ void m139146xe5c17de3(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webSettingsHostApi.mo139164xf52941c9(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$11 */
        static /* synthetic */ void m139147xe5c17de4(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webSettingsHostApi.mo139163x463017ca(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$12 */
        static /* synthetic */ void m139148xe5c17de5(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webSettingsHostApi.mo139162x5f10ad67(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$13 */
        static /* synthetic */ void m139149xe5c17de6(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webSettingsHostApi.mo139172x3ac31d22(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$14 */
        static /* synthetic */ void m139150xe5c17de7(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            arrayList.add(0, webSettingsHostApi.mo139161xb9044875(valueOf));
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$2 */
        static /* synthetic */ void m139151x9c0e7fee(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webSettingsHostApi.mo139166x6b8ba2b(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$3 */
        static /* synthetic */ void m139152x9c0e7fef(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webSettingsHostApi.mo139170x5d27586(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$4 */
        static /* synthetic */ void m139153x9c0e7ff0(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webSettingsHostApi.mo139167xcef808b2(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$5 */
        static /* synthetic */ void m139154x9c0e7ff1(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webSettingsHostApi.mo139174xefdae1e9(valueOf, str);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$6 */
        static /* synthetic */ void m139155x9c0e7ff2(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webSettingsHostApi.mo139169x60e97253(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$7 */
        static /* synthetic */ void m139156x9c0e7ff3(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webSettingsHostApi.mo139171x1e65280(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$8 */
        static /* synthetic */ void m139157x9c0e7ff4(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webSettingsHostApi.mo139168x7c25ab2a(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$9 */
        static /* synthetic */ void m139158x9c0e7ff5(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webSettingsHostApi.mo139173xa2cf6f1e(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m139159x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi webSettingsHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.create", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139144x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setDomStorageEnabled", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa2.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$l
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139145x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa2.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa3 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa3.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$m
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139151x9c0e7fee(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa3.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa4 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setSupportMultipleWindows", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa4.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$n
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139152x9c0e7fef(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa4.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa5 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setJavaScriptEnabled", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa5.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$o
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139153x9c0e7ff0(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa5.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa6 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setUserAgentString", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa6.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$b
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139154x9c0e7ff1(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa6.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa7 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setMediaPlaybackRequiresUserGesture", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa7.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$c
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139155x9c0e7ff2(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa7.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa8 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setSupportZoom", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa8.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$d
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139156x9c0e7ff3(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa8.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa9 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setLoadWithOverviewMode", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa9.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$e
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139157x9c0e7ff4(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa9.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa10 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setUseWideViewPort", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa10.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$f
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139158x9c0e7ff5(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa10.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa11 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setDisplayZoomControls", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa11.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$g
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139146xe5c17de3(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa11.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa12 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setBuiltInZoomControls", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa12.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$h
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139147xe5c17de4(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa12.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa13 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setAllowFileAccess", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa13.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$i
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139148xe5c17de5(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa13.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa14 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setTextZoom", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa14.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$j
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139149xe5c17de6(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa14.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa15 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.getUserAgentString", m139143x7444b660());
            if (webSettingsHostApi != null) {
                c28677x2598ceaa15.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$k
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139150xe5c17de7(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa15.m138404x12ef5e45(null);
            }
        }

        /* renamed from: create */
        void mo139160xaf65a0fc(java.lang.Long l17, java.lang.Long l18);

        /* renamed from: getUserAgentString */
        java.lang.String mo139161xb9044875(java.lang.Long l17);

        /* renamed from: setAllowFileAccess */
        void mo139162x5f10ad67(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setBuiltInZoomControls */
        void mo139163x463017ca(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setDisplayZoomControls */
        void mo139164xf52941c9(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setDomStorageEnabled */
        void mo139165xea71b9e6(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setJavaScriptCanOpenWindowsAutomatically */
        void mo139166x6b8ba2b(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setJavaScriptEnabled */
        void mo139167xcef808b2(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setLoadWithOverviewMode */
        void mo139168x7c25ab2a(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setMediaPlaybackRequiresUserGesture */
        void mo139169x60e97253(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setSupportMultipleWindows */
        void mo139170x5d27586(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setSupportZoom */
        void mo139171x1e65280(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setTextZoom */
        void mo139172x3ac31d22(java.lang.Long l17, java.lang.Long l18);

        /* renamed from: setUseWideViewPort */
        void mo139173xa2cf6f1e(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: setUserAgentString */
        void mo139174xefdae1e9(java.lang.Long l17, java.lang.String str);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebStorageHostApi */
    /* loaded from: classes16.dex */
    public interface WebStorageHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139175x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m139176x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebStorageHostApi webStorageHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webStorageHostApi.mo139179xaf65a0fc(valueOf);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$1 */
        static /* synthetic */ void m139177x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebStorageHostApi webStorageHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webStorageHostApi.mo139180xbd6590c0(valueOf);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m139178x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebStorageHostApi webStorageHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebStorageHostApi.create", m139175x7444b660());
            if (webStorageHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebStorageHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebStorageHostApi.m139176x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebStorageHostApi.deleteAllData", m139175x7444b660());
            if (webStorageHostApi != null) {
                c28677x2598ceaa2.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebStorageHostApi$$b
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebStorageHostApi.m139177x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa2.m138404x12ef5e45(null);
            }
        }

        /* renamed from: create */
        void mo139179xaf65a0fc(java.lang.Long l17);

        /* renamed from: deleteAllData */
        void mo139180xbd6590c0(java.lang.Long l17);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi */
    /* loaded from: classes16.dex */
    public static class WebViewClientFlutterApi {

        /* renamed from: binaryMessenger */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72053x56f9c012;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$Reply */
        /* loaded from: classes16.dex */
        public interface Reply<T> {
            /* renamed from: reply */
            void mo139198x67612ea(T t17);
        }

        public WebViewClientFlutterApi(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
            this.f72053x56f9c012 = interfaceC28679x1b8c77f2;
        }

        /* renamed from: getCodec */
        public static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139181x7444b660() {
            return io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApiCodec.f72054x4fbc8495;
        }

        /* renamed from: doUpdateVisitedHistory */
        public void m139190x8268445e(java.lang.Long l17, java.lang.Long l18, java.lang.String str, java.lang.Boolean bool, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72053x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.doUpdateVisitedHistory", m139181x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, str, bool)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$f
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply.this.mo139198x67612ea(null);
                }
            });
        }

        /* renamed from: onPageFinished */
        public void m139191xe1e213a0(java.lang.Long l17, java.lang.Long l18, java.lang.String str, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72053x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onPageFinished", m139181x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, str)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$e
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply.this.mo139198x67612ea(null);
                }
            });
        }

        /* renamed from: onPageStarted */
        public void m139192x65f3cf93(java.lang.Long l17, java.lang.Long l18, java.lang.String str, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72053x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onPageStarted", m139181x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, str)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$c
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply.this.mo139198x67612ea(null);
                }
            });
        }

        /* renamed from: onReceivedError */
        public void m139193xa740e108(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.String str, java.lang.String str2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72053x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedError", m139181x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, l19, str, str2)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$g
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply.this.mo139198x67612ea(null);
                }
            });
        }

        /* renamed from: onReceivedHttpAuthRequest */
        public void m139194x2255491f(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.String str, java.lang.String str2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72053x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedHttpAuthRequest", m139181x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, l19, str, str2)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$h
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply.this.mo139198x67612ea(null);
                }
            });
        }

        /* renamed from: onReceivedRequestError */
        public void m139195x78e441b9(java.lang.Long l17, java.lang.Long l18, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData webResourceRequestData, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData webResourceErrorData, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72053x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedRequestError", m139181x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, webResourceRequestData, webResourceErrorData)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$a
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply.this.mo139198x67612ea(null);
                }
            });
        }

        /* renamed from: requestLoading */
        public void m139196xa56e57ad(java.lang.Long l17, java.lang.Long l18, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData webResourceRequestData, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72053x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.requestLoading", m139181x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, webResourceRequestData)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$b
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply.this.mo139198x67612ea(null);
                }
            });
        }

        /* renamed from: urlLoading */
        public void m139197xf65288cd(java.lang.Long l17, java.lang.Long l18, java.lang.String str, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72053x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.urlLoading", m139181x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, str)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$d
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApi.Reply.this.mo139198x67612ea(null);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApiCodec */
    /* loaded from: classes15.dex */
    public static class WebViewClientFlutterApiCodec extends io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc {

        /* renamed from: INSTANCE */
        public static final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApiCodec f72054x4fbc8495 = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientFlutterApiCodec();

        private WebViewClientFlutterApiCodec() {
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc
        /* renamed from: readValueOfType */
        public java.lang.Object mo84732x8819c70c(byte b17, java.nio.ByteBuffer byteBuffer) {
            return b17 != Byte.MIN_VALUE ? b17 != -127 ? super.mo84732x8819c70c(b17, byteBuffer) : io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData.m139122xb5cc5768((java.util.ArrayList) m138458xbd1ad57b(byteBuffer)) : io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData.m139113xb5cc5768((java.util.ArrayList) m138458xbd1ad57b(byteBuffer));
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc
        /* renamed from: writeValue */
        public void mo84733xd98e5cd2(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.Object obj) {
            if (obj instanceof io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData) {
                byteArrayOutputStream.write(128);
                mo84733xd98e5cd2(byteArrayOutputStream, ((io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceErrorData) obj).m139118xcc327db9());
            } else if (!(obj instanceof io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData)) {
                super.mo84733xd98e5cd2(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                mo84733xd98e5cd2(byteArrayOutputStream, ((io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebResourceRequestData) obj).m139135xcc327db9());
            }
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientHostApi */
    /* loaded from: classes16.dex */
    public interface WebViewClientHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139200x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m139201x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientHostApi webViewClientHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewClientHostApi.mo139204xaf65a0fc(valueOf);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$1 */
        static /* synthetic */ void m139202x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientHostApi webViewClientHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewClientHostApi.mo139205xe8c4c03b(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m139203x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientHostApi webViewClientHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewClientHostApi.create", m139200x7444b660());
            if (webViewClientHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientHostApi.m139201x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewClientHostApi.setSynchronousReturnValueForShouldOverrideUrlLoading", m139200x7444b660());
            if (webViewClientHostApi != null) {
                c28677x2598ceaa2.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientHostApi$$b
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientHostApi.m139202x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa2.m138404x12ef5e45(null);
            }
        }

        /* renamed from: create */
        void mo139204xaf65a0fc(java.lang.Long l17);

        /* renamed from: setSynchronousReturnValueForShouldOverrideUrlLoading */
        void mo139205xe8c4c03b(java.lang.Long l17, java.lang.Boolean bool);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewFlutterApi */
    /* loaded from: classes13.dex */
    public static class WebViewFlutterApi {

        /* renamed from: binaryMessenger */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72055x56f9c012;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewFlutterApi$Reply */
        /* loaded from: classes13.dex */
        public interface Reply<T> {
            /* renamed from: reply */
            void mo139211x67612ea(T t17);
        }

        public WebViewFlutterApi(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
            this.f72055x56f9c012 = interfaceC28679x1b8c77f2;
        }

        /* renamed from: getCodec */
        public static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139206x7444b660() {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc();
        }

        /* renamed from: create */
        public void m139209xaf65a0fc(java.lang.Long l17, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72055x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebViewFlutterApi.create", m139206x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewFlutterApi$$b
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewFlutterApi.Reply.this.mo139211x67612ea(null);
                }
            });
        }

        /* renamed from: onScrollChanged */
        public void m139210x7a6f2788(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.Long l27, java.lang.Long l28, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewFlutterApi.Reply<java.lang.Void> reply) {
            new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.f72055x56f9c012, "dev.flutter.pigeon.webview_flutter_android.WebViewFlutterApi.onScrollChanged", m139206x7444b660()).m138403x35cf88(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, l19, l27, l28)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewFlutterApi$$a
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public final void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewFlutterApi.Reply.this.mo139211x67612ea(null);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi */
    /* loaded from: classes16.dex */
    public interface WebViewHostApi {
        /* renamed from: getCodec */
        static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m139212x7444b660() {
            return io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApiCodec.f72058x4fbc8495;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$0 */
        static /* synthetic */ void m139213x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139244xaf65a0fc(valueOf);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$1 */
        static /* synthetic */ void m139214x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            java.lang.String str2 = (java.lang.String) arrayList2.get(2);
            java.lang.String str3 = (java.lang.String) arrayList2.get(3);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139253x6dfa45b0(valueOf, str, str2, str3);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$10 */
        static /* synthetic */ void m139215xe5c17de3(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139257xc84a8199(valueOf);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$11 */
        static /* synthetic */ void m139216xe5c17de4(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139243xd2bef135(valueOf, bool);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$12 */
        static /* synthetic */ void m139217xe5c17de5(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            webViewHostApi.mo139245x738236e6(number == null ? null : java.lang.Long.valueOf(number.longValue()), (java.lang.String) arrayList2.get(1), new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.Result<java.lang.String>() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.1
                @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.Result
                /* renamed from: error */
                public void mo138993x5c4d208(java.lang.Throwable th6) {
                    reply.mo84787x67612ea(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6));
                }

                @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.Result
                /* renamed from: success, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public void mo138994x90b54003(java.lang.String str) {
                    arrayList.add(0, str);
                    reply.mo84787x67612ea(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$13 */
        static /* synthetic */ void m139218xe5c17de6(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            arrayList.add(0, webViewHostApi.mo139249x7531c8a2(valueOf));
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$14 */
        static /* synthetic */ void m139219xe5c17de7(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            java.lang.Number number3 = (java.lang.Number) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139260xe8077228(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()), number3 == null ? null : java.lang.Long.valueOf(number3.longValue()));
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$15 */
        static /* synthetic */ void m139220xe5c17de8(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            java.lang.Number number3 = (java.lang.Number) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139259xe8077004(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()), number3 == null ? null : java.lang.Long.valueOf(number3.longValue()));
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$16 */
        static /* synthetic */ void m139221xe5c17de9(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            arrayList.add(0, webViewHostApi.mo139247xb0a42ef5(valueOf));
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$17 */
        static /* synthetic */ void m139222xe5c17dea(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            arrayList.add(0, webViewHostApi.mo139248xb0a42ef6(valueOf));
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$18 */
        static /* synthetic */ void m139223xe5c17deb(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            arrayList.add(0, webViewHostApi.mo139246x6a71940c(valueOf));
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$19 */
        static /* synthetic */ void m139224xe5c17dec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                webViewHostApi.mo139264xc9bc595f((java.lang.Boolean) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th6) {
                arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
            }
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$2 */
        static /* synthetic */ void m139225x9c0e7fee(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            java.lang.String str2 = (java.lang.String) arrayList2.get(2);
            java.lang.String str3 = (java.lang.String) arrayList2.get(3);
            java.lang.String str4 = (java.lang.String) arrayList2.get(4);
            java.lang.String str5 = (java.lang.String) arrayList2.get(5);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139254x9b341968(valueOf, str, str2, str3, str4, str5);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$20 */
        static /* synthetic */ void m139226xe5c17e02(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139265x23d27c02(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$21 */
        static /* synthetic */ void m139227xe5c17e03(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139240xfaca6415(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$22 */
        static /* synthetic */ void m139228xe5c17e04(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139258x5a2a4692(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$23 */
        static /* synthetic */ void m139229xe5c17e05(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139262x7619e5de(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$24 */
        static /* synthetic */ void m139230xe5c17e06(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139263x6fd49b97(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$25 */
        static /* synthetic */ void m139231xe5c17e07(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139261x67f06213(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$3 */
        static /* synthetic */ void m139232x9c0e7fef(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            java.util.Map<java.lang.String, java.lang.String> map = (java.util.Map) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139255x141096a9(valueOf, str, map);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$4 */
        static /* synthetic */ void m139233x9c0e7ff0(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            byte[] bArr = (byte[]) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139256xe8ae70af(valueOf, str, bArr);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$5 */
        static /* synthetic */ void m139234x9c0e7ff1(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            arrayList.add(0, webViewHostApi.mo139250xb5887639(valueOf));
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$6 */
        static /* synthetic */ void m139235x9c0e7ff2(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            arrayList.add(0, webViewHostApi.mo139241xed1a21df(valueOf));
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$7 */
        static /* synthetic */ void m139236x9c0e7ff3(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            arrayList.add(0, webViewHostApi.mo139242xc062b2cd(valueOf));
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$8 */
        static /* synthetic */ void m139237x9c0e7ff4(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139251xb5fed1ef(valueOf);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$setup$9 */
        static /* synthetic */ void m139238x9c0e7ff5(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.m138967xfc72afde(th6);
                }
            }
            webViewHostApi.mo139252xed0748bd(valueOf);
            arrayList.add(0, null);
            reply.mo84787x67612ea(arrayList);
        }

        /* renamed from: setup */
        static void m139239x6843a7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi webViewHostApi) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.create", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$a
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139213x9c0e7fec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadData", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa2.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$c
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139214x9c0e7fed(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa2.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa3 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadDataWithBaseUrl", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa3.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$j
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139225x9c0e7fee(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa3.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa4 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadUrl", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa4.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$k
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139232x9c0e7fef(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa4.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa5 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.postUrl", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa5.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$m
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139233x9c0e7ff0(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa5.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa6 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getUrl", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa6.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$n
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139234x9c0e7ff1(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa6.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa7 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.canGoBack", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa7.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$o
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139235x9c0e7ff2(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa7.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa8 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.canGoForward", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa8.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$p
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139236x9c0e7ff3(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa8.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa9 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.goBack", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa9.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$q
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139237x9c0e7ff4(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa9.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa10 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.goForward", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa10.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$r
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139238x9c0e7ff5(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa10.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa11 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.reload", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa11.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$l
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139215xe5c17de3(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa11.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa12 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.clearCache", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa12.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$s
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139216xe5c17de4(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa12.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa13 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.evaluateJavascript", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa13.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$t
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139217xe5c17de5(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa13.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa14 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getTitle", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa14.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$u
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139218xe5c17de6(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa14.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa15 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.scrollTo", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa15.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$v
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139219xe5c17de7(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa15.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa16 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.scrollBy", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa16.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$w
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139220xe5c17de8(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa16.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa17 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollX", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa17.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$x
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139221xe5c17de9(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa17.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa18 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollY", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa18.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$y
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139222xe5c17dea(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa18.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa19 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollPosition", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa19.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$z
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139223xe5c17deb(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa19.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa20 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebContentsDebuggingEnabled", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa20.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$b
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139224xe5c17dec(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa20.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa21 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebViewClient", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa21.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$d
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139226xe5c17e02(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa21.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa22 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.addJavaScriptChannel", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa22.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$e
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139227xe5c17e03(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa22.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa23 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.removeJavaScriptChannel", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa23.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$f
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139228xe5c17e04(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa23.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa24 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setDownloadListener", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa24.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$g
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139229xe5c17e05(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa24.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa25 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebChromeClient", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa25.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$h
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139230xe5c17e06(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa25.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa26 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(interfaceC28679x1b8c77f2, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setBackgroundColor", m139212x7444b660());
            if (webViewHostApi != null) {
                c28677x2598ceaa26.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$i
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply reply) {
                        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139231xe5c17e07(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                c28677x2598ceaa26.m138404x12ef5e45(null);
            }
        }

        /* renamed from: addJavaScriptChannel */
        void mo139240xfaca6415(java.lang.Long l17, java.lang.Long l18);

        /* renamed from: canGoBack */
        java.lang.Boolean mo139241xed1a21df(java.lang.Long l17);

        /* renamed from: canGoForward */
        java.lang.Boolean mo139242xc062b2cd(java.lang.Long l17);

        /* renamed from: clearCache */
        void mo139243xd2bef135(java.lang.Long l17, java.lang.Boolean bool);

        /* renamed from: create */
        void mo139244xaf65a0fc(java.lang.Long l17);

        /* renamed from: evaluateJavascript */
        void mo139245x738236e6(java.lang.Long l17, java.lang.String str, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.Result<java.lang.String> result);

        /* renamed from: getScrollPosition */
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewPoint mo139246x6a71940c(java.lang.Long l17);

        /* renamed from: getScrollX */
        java.lang.Long mo139247xb0a42ef5(java.lang.Long l17);

        /* renamed from: getScrollY */
        java.lang.Long mo139248xb0a42ef6(java.lang.Long l17);

        /* renamed from: getTitle */
        java.lang.String mo139249x7531c8a2(java.lang.Long l17);

        /* renamed from: getUrl */
        java.lang.String mo139250xb5887639(java.lang.Long l17);

        /* renamed from: goBack */
        void mo139251xb5fed1ef(java.lang.Long l17);

        /* renamed from: goForward */
        void mo139252xed0748bd(java.lang.Long l17);

        /* renamed from: loadData */
        void mo139253x6dfa45b0(java.lang.Long l17, java.lang.String str, java.lang.String str2, java.lang.String str3);

        /* renamed from: loadDataWithBaseUrl */
        void mo139254x9b341968(java.lang.Long l17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

        /* renamed from: loadUrl */
        void mo139255x141096a9(java.lang.Long l17, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);

        /* renamed from: postUrl */
        void mo139256xe8ae70af(java.lang.Long l17, java.lang.String str, byte[] bArr);

        /* renamed from: reload */
        void mo139257xc84a8199(java.lang.Long l17);

        /* renamed from: removeJavaScriptChannel */
        void mo139258x5a2a4692(java.lang.Long l17, java.lang.Long l18);

        /* renamed from: scrollBy */
        void mo139259xe8077004(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19);

        /* renamed from: scrollTo */
        void mo139260xe8077228(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19);

        /* renamed from: setBackgroundColor */
        void mo139261x67f06213(java.lang.Long l17, java.lang.Long l18);

        /* renamed from: setDownloadListener */
        void mo139262x7619e5de(java.lang.Long l17, java.lang.Long l18);

        /* renamed from: setWebChromeClient */
        void mo139263x6fd49b97(java.lang.Long l17, java.lang.Long l18);

        /* renamed from: setWebContentsDebuggingEnabled */
        void mo139264xc9bc595f(java.lang.Boolean bool);

        /* renamed from: setWebViewClient */
        void mo139265x23d27c02(java.lang.Long l17, java.lang.Long l18);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApiCodec */
    /* loaded from: classes13.dex */
    public static class WebViewHostApiCodec extends io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc {

        /* renamed from: INSTANCE */
        public static final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApiCodec f72058x4fbc8495 = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApiCodec();

        private WebViewHostApiCodec() {
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc
        /* renamed from: readValueOfType */
        public java.lang.Object mo84732x8819c70c(byte b17, java.nio.ByteBuffer byteBuffer) {
            return b17 != Byte.MIN_VALUE ? super.mo84732x8819c70c(b17, byteBuffer) : io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewPoint.m139267xb5cc5768((java.util.ArrayList) m138458xbd1ad57b(byteBuffer));
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc
        /* renamed from: writeValue */
        public void mo84733xd98e5cd2(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.Object obj) {
            if (!(obj instanceof io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewPoint)) {
                super.mo84733xd98e5cd2(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                mo84733xd98e5cd2(byteArrayOutputStream, ((io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewPoint) obj).m139272xcc327db9());
            }
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewPoint */
    /* loaded from: classes13.dex */
    public static final class WebViewPoint {

        /* renamed from: x, reason: collision with root package name */
        private java.lang.Long f374910x;

        /* renamed from: y, reason: collision with root package name */
        private java.lang.Long f374911y;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewPoint$Builder */
        /* loaded from: classes13.dex */
        public static final class Builder {

            /* renamed from: x, reason: collision with root package name */
            private java.lang.Long f374912x;

            /* renamed from: y, reason: collision with root package name */
            private java.lang.Long f374913y;

            /* renamed from: build */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewPoint m139273x59bc66e() {
                io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewPoint webViewPoint = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewPoint();
                webViewPoint.m139270x35d036(this.f374912x);
                webViewPoint.m139271x35d037(this.f374913y);
                return webViewPoint;
            }

            /* renamed from: setX */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewPoint.Builder m139274x35d036(java.lang.Long l17) {
                this.f374912x = l17;
                return this;
            }

            /* renamed from: setY */
            public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewPoint.Builder m139275x35d037(java.lang.Long l17) {
                this.f374913y = l17;
                return this;
            }
        }

        /* renamed from: fromList */
        public static io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewPoint m139267xb5cc5768(java.util.ArrayList<java.lang.Object> arrayList) {
            java.lang.Long valueOf;
            io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewPoint webViewPoint = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewPoint();
            java.lang.Object obj = arrayList.get(0);
            java.lang.Long l17 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = java.lang.Long.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : ((java.lang.Long) obj).longValue());
            }
            webViewPoint.m139270x35d036(valueOf);
            java.lang.Object obj2 = arrayList.get(1);
            if (obj2 != null) {
                l17 = java.lang.Long.valueOf(obj2 instanceof java.lang.Integer ? ((java.lang.Integer) obj2).intValue() : ((java.lang.Long) obj2).longValue());
            }
            webViewPoint.m139271x35d037(l17);
            return webViewPoint;
        }

        /* renamed from: getX */
        public java.lang.Long m139268x305bc2() {
            return this.f374910x;
        }

        /* renamed from: getY */
        public java.lang.Long m139269x305bc3() {
            return this.f374911y;
        }

        /* renamed from: setX */
        public void m139270x35d036(java.lang.Long l17) {
            if (l17 == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"x\" is null.");
            }
            this.f374910x = l17;
        }

        /* renamed from: setY */
        public void m139271x35d037(java.lang.Long l17) {
            if (l17 == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"y\" is null.");
            }
            this.f374911y = l17;
        }

        /* renamed from: toList */
        public java.util.ArrayList<java.lang.Object> m139272xcc327db9() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(2);
            arrayList.add(this.f374910x);
            arrayList.add(this.f374911y);
            return arrayList;
        }
    }

    /* renamed from: wrapError */
    public static java.util.ArrayList<java.lang.Object> m138967xfc72afde(java.lang.Throwable th6) {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(3);
        if (th6 instanceof io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FlutterError) {
            io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FlutterError flutterError = (io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FlutterError) th6;
            arrayList.add(flutterError.f72029x2eaded);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.f72030x5cd8f242);
        } else {
            arrayList.add(th6.toString());
            arrayList.add(th6.getClass().getSimpleName());
            arrayList.add("Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
        }
        return arrayList;
    }
}
