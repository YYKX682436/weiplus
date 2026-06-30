package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes13.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2829xfa87f9de.r f296401a;

    public static void a(java.lang.String str, java.lang.String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || !b(str) || !str2.equals(f296401a.f296406d)) {
            return;
        }
        try {
            com.p314xaae8f345.mm.p2829xfa87f9de.r rVar = f296401a;
            fp.e eVar = rVar.f296412j;
            fp.c cVar = rVar.f296413k;
            if (eVar != null && cVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "finishPlay removeFocusListener");
                fp.d dVar = eVar.f346709a;
                if (dVar != null) {
                    fp.g gVar = (fp.g) dVar;
                    if (gVar.f346731c == cVar) {
                        gVar.f346731c = null;
                    }
                }
                eVar.a();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "finishPlay removeFocusListener error: " + th6.getMessage());
            d("finishPlay error ", th6);
        }
        try {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf a17 = f296401a.a();
            java.lang.ref.WeakReference weakReference = f296401a.f296414l;
            android.content.BroadcastReceiver broadcastReceiver = weakReference == null ? null : (android.content.BroadcastReceiver) weakReference.get();
            if (a17 != null && broadcastReceiver != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "finishPlay unregisterReceiver");
                a17.unregisterReceiver(broadcastReceiver);
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "finishPlay unregisterReceiver error: " + th7.getMessage());
            d("finishPlay error ", th7);
        }
        try {
            com.p314xaae8f345.mm.p2829xfa87f9de.C22987x97ad1828 b17 = f296401a.b();
            if (b17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "finishPlay releaseProgressBar");
                if (b17.f296348n != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerProgress", "stopTimer");
                    b17.f296348n.cancel(false);
                    b17.f296348n = null;
                }
                b17.f296347m = null;
                com.p314xaae8f345.mm.p2829xfa87f9de.C22988x4db43e47 c22988x4db43e47 = b17.f296346i;
                if (c22988x4db43e47 != null) {
                    c22988x4db43e47.m83870x695f968a(null);
                }
            }
        } catch (java.lang.Throwable th8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "finishPlay releaseProgressBar error: " + th8.getMessage());
            d("finishPlay error ", th8);
        }
        try {
            com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = f296401a.f296410h;
            if (interfaceC26164x73fc6bc6 != null && interfaceC26164x73fc6bc6.mo100916xb7d72d0e() != 11) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "finishPlay releasePlayer");
                interfaceC26164x73fc6bc6.mo100933x41012807();
            }
        } catch (java.lang.Throwable th9) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "finishPlay releasePlayer error: " + th9.getMessage());
            d("finishPlay error ", th9);
        }
        f296401a = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "finishPlay complete, token = ".concat(str));
    }

    public static boolean b(java.lang.String str) {
        com.p314xaae8f345.mm.p2829xfa87f9de.r rVar;
        if (str == null || str.isEmpty() || (rVar = f296401a) == null) {
            return false;
        }
        if (str.equals(rVar.f296408f)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "isCurrentParamsValid, token invalid, token in param = " + f296401a.f296408f + ", token = " + str);
        return false;
    }

    public static void c(java.lang.String str, android.webkit.ValueCallback valueCallback, int i17, android.content.Context context, com.p314xaae8f345.p3210x3857dc.j jVar) {
        com.p314xaae8f345.mm.p2829xfa87f9de.r rVar = f296401a;
        if (rVar != null) {
            if (rVar.f296416n) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "onReceiveValueProcess already reported ret, ignore");
                return;
            }
            rVar.f296416n = true;
        }
        com.p314xaae8f345.p3210x3857dc.n.r(str, -1, i17, context, jVar);
        if (valueCallback != null) {
            if (i17 != 0) {
                valueCallback.onReceiveValue(-102);
            } else {
                valueCallback.onReceiveValue(java.lang.Integer.valueOf(i17));
            }
        }
    }

    public static void d(java.lang.String str, java.lang.Throwable th6) {
        com.p314xaae8f345.mm.p2829xfa87f9de.r rVar = f296401a;
        if (rVar != null) {
            java.lang.String str2 = rVar.f296407e;
            if (str2 == null) {
                str2 = "";
            }
            com.p314xaae8f345.p3210x3857dc.n.l("XFilesAudioPlayer_".concat(str2), -1, str, th6);
        }
    }

    public static boolean e(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2829xfa87f9de.p pVar, com.p314xaae8f345.p3210x3857dc.i iVar, int i17) {
        try {
            if (pVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "tryPlayInner, playerListener invalid");
                return false;
            }
            pVar.f296399g = -1;
            if (interfaceC26164x73fc6bc6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "tryPlayInner, tpPlayer is null");
                return false;
            }
            if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
                int mo100916xb7d72d0e = interfaceC26164x73fc6bc6.mo100916xb7d72d0e();
                if (mo100916xb7d72d0e != 1 && mo100916xb7d72d0e != 2 && mo100916xb7d72d0e != 9) {
                    if (i17 >= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "tryPlayInner, need seek to " + i17);
                        interfaceC26164x73fc6bc6.mo100936xc9fc1b13(i17);
                    } else if (mo100916xb7d72d0e == 7) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "tryPlayInner, now is complete, need seek to 0");
                        interfaceC26164x73fc6bc6.mo100936xc9fc1b13(0);
                    }
                    if (mo100916xb7d72d0e != 5) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "tryPlayInner, try start");
                        interfaceC26164x73fc6bc6.mo100975x68ac462();
                    }
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "tryPlayInner need prepare, currentState = " + mo100916xb7d72d0e + ", needSeekToMs = " + i17);
                int ordinal = iVar.ordinal();
                if (ordinal == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "tryPlayInner set tponly");
                    interfaceC26164x73fc6bc6.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(202, 1L));
                } else if (ordinal == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "tryPlayInner set tpfirst");
                    interfaceC26164x73fc6bc6.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(202, 2L));
                } else if (ordinal == 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "tryPlayInner set sysonly");
                    interfaceC26164x73fc6bc6.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(202, 3L));
                } else if (ordinal == 4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "tryPlayInner set sysfirst");
                    interfaceC26164x73fc6bc6.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(202, 4L));
                }
                if ("aac".equalsIgnoreCase(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "tryPlayInner is aac, enable accurate duration");
                    interfaceC26164x73fc6bc6.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101058xb88ec5da(144, true));
                }
                interfaceC26164x73fc6bc6.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a, 3L));
                interfaceC26164x73fc6bc6.mo100945x683d6267(str);
                interfaceC26164x73fc6bc6.mo100947xfd27780d(false);
                interfaceC26164x73fc6bc6.mo100957x5dd7c812(pVar);
                interfaceC26164x73fc6bc6.mo100955x40f8c003(pVar);
                interfaceC26164x73fc6bc6.mo100956xa23b7bf3(pVar);
                interfaceC26164x73fc6bc6.mo100951xa4560c71(pVar);
                interfaceC26164x73fc6bc6.mo100954x6954c27b(pVar);
                pVar.f296399g = i17;
                interfaceC26164x73fc6bc6.mo100932x857611b5();
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "tryPlayInner, filePath is empty");
            return false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "tryPlayInner error: " + th6.getMessage());
            d("tryPlayInner error ", th6);
            return false;
        }
    }
}
