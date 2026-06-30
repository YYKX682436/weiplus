package wh;

/* loaded from: classes12.dex */
public class a implements wh.a2 {
    @Override // wh.a2
    public java.lang.Object a(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        return null;
    }

    @Override // wh.a2
    public void b(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        wh.d dVar;
        wh.b bVar;
        oj.j.e("Matrix.battery.AlarmHooker", "onServiceMethodInvoke: method name %s", method.getName());
        int i17 = 0;
        wh.d dVar2 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        wh.b bVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        if (!method.getName().equals("set") && !method.getName().equals("setRepeating") && !method.getName().equals("setInexactRepeating")) {
            if (method.getName().equals("remove")) {
                if (objArr == null) {
                    oj.j.f("Matrix.battery.AlarmHooker", "createCancelArgs args null", new java.lang.Object[0]);
                } else {
                    int i18 = android.os.Build.VERSION.SDK_INT;
                    oj.j.c("Matrix.battery.AlarmHooker", "createCancelArgs apiLevel:%d, codeName:%s, versionRelease:%s", java.lang.Integer.valueOf(i18), android.os.Build.VERSION.CODENAME, java.lang.Integer.valueOf(i18));
                    int length = objArr.length;
                    oj.j.c("Matrix.battery.AlarmHooker", "createCancelArgsAccordingToArgsLength: length:%s", java.lang.Integer.valueOf(length));
                    if (length != 1) {
                        if (objArr.length != 2) {
                            oj.j.f("Matrix.battery.AlarmHooker", "createCancelArgs2 args length invalid : %d", java.lang.Integer.valueOf(objArr.length));
                        } else {
                            bVar = new wh.b(null);
                            java.lang.Object obj = objArr[0];
                            if (obj == null || (obj instanceof android.app.PendingIntent)) {
                                bVar.f527270a = (android.app.PendingIntent) obj;
                                bVar2 = bVar;
                            } else {
                                oj.j.f("Matrix.battery.AlarmHooker", "createCancelArgs2 args idx 0 not PendingIntent, %s", obj);
                            }
                        }
                    } else if (objArr.length != 1) {
                        oj.j.f("Matrix.battery.AlarmHooker", "createCancelArgs1 args length invalid : %d", java.lang.Integer.valueOf(objArr.length));
                    } else {
                        bVar = new wh.b(null);
                        java.lang.Object obj2 = objArr[0];
                        if (obj2 == null || (obj2 instanceof android.app.PendingIntent)) {
                            bVar.f527270a = (android.app.PendingIntent) obj2;
                            bVar2 = bVar;
                        } else {
                            oj.j.f("Matrix.battery.AlarmHooker", "createCancelArgs1 args idx 0 not PendingIntent, %s", obj2);
                        }
                    }
                }
                if (bVar2 == null) {
                    oj.j.f("Matrix.battery.AlarmHooker", "dispatchCancel cancelArgs null", new java.lang.Object[0]);
                    return;
                }
                synchronized (wh.e.class) {
                    while (true) {
                        java.util.List list = wh.e.f527298c;
                        if (i17 < ((java.util.ArrayList) list).size()) {
                            wh.c cVar = (wh.c) ((java.util.ArrayList) list).get(i17);
                            android.app.PendingIntent pendingIntent = bVar2.f527270a;
                            rh.h hVar = (rh.h) cVar;
                            hVar.getClass();
                            if (pendingIntent != null) {
                                pendingIntent.hashCode();
                                synchronized (hVar.f476938a.f476984c.f476971a) {
                                    r0.f476973c--;
                                }
                            }
                            i17++;
                        }
                    }
                }
                return;
            }
            return;
        }
        if (objArr == null) {
            oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args null", new java.lang.Object[0]);
        } else {
            int i19 = android.os.Build.VERSION.SDK_INT;
            oj.j.c("Matrix.battery.AlarmHooker", "createSetArgs apiLevel:%d, codeName:%s, versionRelease:%s", java.lang.Integer.valueOf(i19), android.os.Build.VERSION.CODENAME, java.lang.Integer.valueOf(i19));
            int length2 = objArr.length;
            oj.j.c("Matrix.battery.AlarmHooker", "createSetArgsAccordingToArgsLength: length:%s", java.lang.Integer.valueOf(length2));
            if (length2 != 3) {
                if (length2 != 4) {
                    if (length2 == 6 || length2 == 7) {
                        if (objArr.length == 7 || objArr.length == 6) {
                            dVar = new wh.d(null);
                            java.lang.Object obj3 = objArr[0];
                            if (obj3 instanceof java.lang.Integer) {
                                dVar.f527286a = ((java.lang.Integer) obj3).intValue();
                                java.lang.Object obj4 = objArr[1];
                                if (obj4 instanceof java.lang.Long) {
                                    dVar.f527287b = ((java.lang.Long) obj4).longValue();
                                    java.lang.Object obj5 = objArr[2];
                                    if (obj5 instanceof java.lang.Long) {
                                        dVar.f527288c = ((java.lang.Long) obj5).longValue();
                                        java.lang.Object obj6 = objArr[3];
                                        if (obj6 instanceof java.lang.Long) {
                                            dVar.f527289d = ((java.lang.Long) obj6).longValue();
                                            java.lang.Object obj7 = objArr[4];
                                            if (obj7 == null || (obj7 instanceof android.app.PendingIntent)) {
                                                dVar.f527291f = (android.app.PendingIntent) obj7;
                                                dVar2 = dVar;
                                            } else {
                                                oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 4 not PendingIntent, %s", obj7);
                                            }
                                        } else {
                                            oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 3 not Long, %s", obj6);
                                        }
                                    } else {
                                        oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 2 not Long, %s", obj5);
                                    }
                                } else {
                                    oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 1 not Long, %s", obj4);
                                }
                            } else {
                                oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 0 not Integer, %s", obj3);
                            }
                        } else {
                            oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args length invalid : %d", java.lang.Integer.valueOf(objArr.length));
                        }
                    } else if (length2 != 8) {
                        if (objArr.length != 11) {
                            oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args length invalid : %d", java.lang.Integer.valueOf(objArr.length));
                        } else {
                            dVar = new wh.d(null);
                            java.lang.Object obj8 = objArr[1];
                            if (obj8 instanceof java.lang.Integer) {
                                dVar.f527286a = ((java.lang.Integer) obj8).intValue();
                                java.lang.Object obj9 = objArr[2];
                                if (obj9 instanceof java.lang.Long) {
                                    dVar.f527287b = ((java.lang.Long) obj9).longValue();
                                    java.lang.Object obj10 = objArr[3];
                                    if (obj10 instanceof java.lang.Long) {
                                        dVar.f527288c = ((java.lang.Long) obj10).longValue();
                                        java.lang.Object obj11 = objArr[4];
                                        if (obj11 instanceof java.lang.Long) {
                                            dVar.f527289d = ((java.lang.Long) obj11).longValue();
                                            java.lang.Object obj12 = objArr[5];
                                            if (obj12 instanceof java.lang.Integer) {
                                                dVar.f527290e = ((java.lang.Integer) obj12).intValue();
                                                java.lang.Object obj13 = objArr[6];
                                                if (obj13 == null || (obj13 instanceof android.app.PendingIntent)) {
                                                    dVar.f527291f = (android.app.PendingIntent) obj13;
                                                    dVar2 = dVar;
                                                } else {
                                                    oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 6 not PendingIntent, %s", obj13);
                                                }
                                            } else {
                                                oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 5 not Integer, %s", obj12);
                                            }
                                        } else {
                                            oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 4 not Long, %s", obj11);
                                        }
                                    } else {
                                        oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 3 not Long, %s", obj10);
                                    }
                                } else {
                                    oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 2 not Long, %s", obj9);
                                }
                            } else {
                                oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 1 not Integer, %s", obj8);
                            }
                        }
                    } else if (objArr.length != 8) {
                        oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args length invalid : %d", java.lang.Integer.valueOf(objArr.length));
                    } else {
                        dVar = new wh.d(null);
                        java.lang.Object obj14 = objArr[0];
                        if (obj14 instanceof java.lang.Integer) {
                            dVar.f527286a = ((java.lang.Integer) obj14).intValue();
                            java.lang.Object obj15 = objArr[1];
                            if (obj15 instanceof java.lang.Long) {
                                dVar.f527287b = ((java.lang.Long) obj15).longValue();
                                java.lang.Object obj16 = objArr[2];
                                if (obj16 instanceof java.lang.Long) {
                                    dVar.f527288c = ((java.lang.Long) obj16).longValue();
                                    java.lang.Object obj17 = objArr[3];
                                    if (obj17 instanceof java.lang.Long) {
                                        dVar.f527289d = ((java.lang.Long) obj17).longValue();
                                        java.lang.Object obj18 = objArr[4];
                                        if (obj18 instanceof java.lang.Integer) {
                                            dVar.f527290e = ((java.lang.Integer) obj18).intValue();
                                            java.lang.Object obj19 = objArr[5];
                                            if (obj19 == null || (obj19 instanceof android.app.PendingIntent)) {
                                                dVar.f527291f = (android.app.PendingIntent) obj19;
                                                dVar2 = dVar;
                                            } else {
                                                oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 5 not PendingIntent, %s", obj19);
                                            }
                                        } else {
                                            oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 4 not Integer, %s", obj18);
                                        }
                                    } else {
                                        oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 3 not Long, %s", obj17);
                                    }
                                } else {
                                    oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 2 not Long, %s", obj16);
                                }
                            } else {
                                oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 1 not Long, %s", obj15);
                            }
                        } else {
                            oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 0 not Integer, %s", obj14);
                        }
                    }
                } else if (objArr.length != 4) {
                    oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args length invalid : %d", java.lang.Integer.valueOf(objArr.length));
                } else {
                    dVar = new wh.d(null);
                    java.lang.Object obj20 = objArr[0];
                    if (obj20 instanceof java.lang.Integer) {
                        dVar.f527286a = ((java.lang.Integer) obj20).intValue();
                        java.lang.Object obj21 = objArr[1];
                        if (obj21 instanceof java.lang.Long) {
                            dVar.f527287b = ((java.lang.Long) obj21).longValue();
                            java.lang.Object obj22 = objArr[2];
                            if (obj22 instanceof java.lang.Long) {
                                dVar.f527289d = ((java.lang.Long) obj22).longValue();
                                java.lang.Object obj23 = objArr[3];
                                if (obj23 == null || (obj23 instanceof android.app.PendingIntent)) {
                                    dVar.f527291f = (android.app.PendingIntent) obj23;
                                    dVar2 = dVar;
                                } else {
                                    oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 3 not PendingIntent, %s", obj23);
                                }
                            } else {
                                oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 2 not Long, %s", obj22);
                            }
                        } else {
                            oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 1 not Long, %s", obj21);
                        }
                    } else {
                        oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 0 not Integer, %s", obj20);
                    }
                }
            } else if (objArr.length != 3) {
                oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args length invalid : %d", java.lang.Integer.valueOf(objArr.length));
            } else {
                dVar = new wh.d(null);
                java.lang.Object obj24 = objArr[0];
                if (obj24 instanceof java.lang.Integer) {
                    dVar.f527286a = ((java.lang.Integer) obj24).intValue();
                    java.lang.Object obj25 = objArr[1];
                    if (obj25 instanceof java.lang.Long) {
                        dVar.f527287b = ((java.lang.Long) obj25).longValue();
                        java.lang.Object obj26 = objArr[2];
                        if (obj26 == null || (obj26 instanceof android.app.PendingIntent)) {
                            dVar.f527291f = (android.app.PendingIntent) obj26;
                            dVar2 = dVar;
                        } else {
                            oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 2 not PendingIntent, %s", obj26);
                        }
                    } else {
                        oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 1 not Long, %s", obj25);
                    }
                } else {
                    oj.j.f("Matrix.battery.AlarmHooker", "createSetArgs args idx 0 not Integer, %s", obj24);
                }
            }
        }
        if (dVar2 == null) {
            oj.j.f("Matrix.battery.AlarmHooker", "dispatchSet setArgs null", new java.lang.Object[0]);
            return;
        }
        synchronized (wh.e.class) {
            int i27 = 0;
            while (true) {
                java.util.List list2 = wh.e.f527298c;
                if (i27 < ((java.util.ArrayList) list2).size()) {
                    ((rh.h) ((wh.c) ((java.util.ArrayList) list2).get(i27))).a(dVar2.f527286a, dVar2.f527287b, dVar2.f527288c, dVar2.f527289d, dVar2.f527290e, dVar2.f527291f, null);
                    i27++;
                }
            }
        }
    }
}
