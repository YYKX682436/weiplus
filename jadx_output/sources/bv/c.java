package bv;

@j95.b
/* loaded from: classes14.dex */
public class c extends i95.w implements cv.x0, cv.t0 {
    public void Ai(int i17, int i18, java.lang.String featureKey, int i19, int i27, int i28, int i29) {
        java.lang.Integer[] numArr = wl.a.f446984a;
        kotlin.jvm.internal.o.g(featureKey, "featureKey");
        if (wl.a.f446985b != 0) {
            int intValue = (wl.a.f446984a[0].intValue() * 100) / wl.a.f446985b;
            int intValue2 = (wl.a.f446984a[1].intValue() * 100) / wl.a.f446985b;
            int intValue3 = (wl.a.f446984a[2].intValue() * 100) / wl.a.f446985b;
            int intValue4 = (wl.a.f446984a[3].intValue() * 100) / wl.a.f446985b;
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioRecordReportUtil", "audioType = " + i17 + " ,scenes = " + i18 + ",featureKey=" + featureKey + ",pcmSilent=" + intValue + ", pcmLow=" + intValue2 + ",pcmMiddle=" + intValue3 + ",pcmHigh=" + intValue4 + ",systemSilent=0,systemLow=0,systemMiddle=0,systemHigh=0,audioSource=" + i19 + ",sampleRate=" + i27 + ",mChannelConfig=" + i28 + ",mRecordDetailState=" + i29);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.r(18554, true, true, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), featureKey, java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(intValue3), java.lang.Integer.valueOf(intValue4), 0, 0, 0, 0, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
            wl.a.f446986c = 0;
        }
    }

    public void Bi(int i17, int i18) {
        java.lang.Integer[] numArr = wl.a.f446984a;
        if (i17 == 0) {
            if (i18 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markPCMRecorderAudioSourceFinalRequestMIC");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 34L, 1L);
                return;
            } else {
                if (i18 != 7) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markPCMRecorderAudioSourceFinalRequestVC");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 35L, 1L);
                return;
            }
        }
        if (i17 != 1) {
            return;
        }
        if (i18 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markPCMRecorderAudioSourceFinalRequestMIC");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 34L, 1L);
        } else {
            if (i18 != 7) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markPCMRecorderAudioSourceFinalRequestVC");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 35L, 1L);
        }
    }

    public void Di(int i17) {
        java.lang.Integer[] numArr = wl.a.f446984a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markdoNewAudioRecordeError");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 39L, 1L);
        } else {
            if (i17 != 1) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markdoNewAudioRecordeError");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 39L, 1L);
        }
    }

    public void Ni(int i17) {
        java.lang.Integer[] numArr;
        java.lang.String str;
        char c17;
        java.lang.String str2;
        int i18;
        java.lang.String str3;
        java.lang.String str4;
        boolean z17;
        char c18;
        int i19 = i17;
        if (wl.a.f446985b != 0) {
            java.lang.Integer[] numArr2 = wl.a.f446984a;
            int length = numArr2.length;
            int i27 = 0;
            int i28 = 0;
            while (i27 < length) {
                int i29 = i28 + 1;
                int intValue = numArr2[i27].intValue() * 100;
                long j17 = intValue / wl.a.f446985b;
                if (i19 == 0) {
                    numArr = numArr2;
                    str = "MicroMsg.VOIPPCMRecorderIDKeyStat";
                    c17 = 3;
                    str2 = "MicroMsg.VoiceMsgPCMRecorderIDKeyStat";
                    if (i28 == 0) {
                        i18 = length;
                        str3 = str2;
                        com.tencent.mars.xlog.Log.i(str3, "markPCMAmplitudeSilent " + j17);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 12L, j17);
                    } else if (i28 == 1) {
                        i18 = length;
                        str3 = str2;
                        com.tencent.mars.xlog.Log.i(str3, "markPCMAmplitudeInLow=" + j17);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 19L, j17);
                    } else if (i28 != 2) {
                        if (i28 == 3) {
                            com.tencent.mars.xlog.Log.i(str2, "markPCMAmplitudeHigh " + j17);
                            str3 = str2;
                            i18 = length;
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 33L, j17);
                        }
                        i18 = length;
                        str3 = str2;
                    } else {
                        i18 = length;
                        str3 = str2;
                        com.tencent.mars.xlog.Log.i(str3, "markPCMAmplitudeMiddle: " + j17);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 26L, j17);
                    }
                } else if (i19 != 1) {
                    numArr = numArr2;
                    i18 = length;
                    str3 = "MicroMsg.VoiceMsgPCMRecorderIDKeyStat";
                    str = "MicroMsg.VOIPPCMRecorderIDKeyStat";
                } else {
                    if (i28 == 0) {
                        numArr = numArr2;
                        str4 = "MicroMsg.VoiceMsgPCMRecorderIDKeyStat";
                        z17 = true;
                        str = "MicroMsg.VOIPPCMRecorderIDKeyStat";
                        com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeSilent " + j17);
                        c18 = (char) 3;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 12L, j17);
                    } else if (i28 == 1) {
                        numArr = numArr2;
                        str4 = "MicroMsg.VoiceMsgPCMRecorderIDKeyStat";
                        z17 = true;
                        str = "MicroMsg.VOIPPCMRecorderIDKeyStat";
                        c18 = 3;
                        com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeInLow=" + j17);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 19L, j17);
                    } else if (i28 != 2) {
                        c18 = 3;
                        if (i28 != 3) {
                            numArr = numArr2;
                            i18 = length;
                            str3 = "MicroMsg.VoiceMsgPCMRecorderIDKeyStat";
                            str = "MicroMsg.VOIPPCMRecorderIDKeyStat";
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markPCMAmplitudeHigh " + j17);
                            str4 = "MicroMsg.VoiceMsgPCMRecorderIDKeyStat";
                            numArr = numArr2;
                            z17 = true;
                            str = "MicroMsg.VOIPPCMRecorderIDKeyStat";
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 33L, j17);
                        }
                    } else {
                        numArr = numArr2;
                        z17 = true;
                        str = "MicroMsg.VOIPPCMRecorderIDKeyStat";
                        c18 = 3;
                        com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeMiddle: " + j17);
                        str4 = "MicroMsg.VoiceMsgPCMRecorderIDKeyStat";
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 26L, j17);
                    }
                    str2 = str4;
                    c17 = c18;
                    i18 = length;
                    str3 = str2;
                }
                int i37 = intValue / wl.a.f446985b;
                int i38 = i27;
                java.lang.String str5 = str3;
                if (i19 != 0) {
                    if (i19 == 1) {
                        if (i28 != 0) {
                            if (i28 != 1) {
                                if (i28 != 2) {
                                    if (i28 == 3) {
                                        if (i37 == 0) {
                                            com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeHighPercentAround0");
                                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 27L, 1L);
                                        } else if (i37 <= 20) {
                                            com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeHighPercentAround20");
                                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 28L, 1L);
                                        } else if (i37 <= 40) {
                                            com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeHighPercentAround40");
                                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 29L, 1L);
                                        } else if (i37 <= 60) {
                                            com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeHighPercentAround60");
                                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 30L, 1L);
                                        } else if (i37 <= 80) {
                                            com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeHighPercentAround80");
                                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 31L, 1L);
                                        } else if (i37 <= 100) {
                                            com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeHighPercentAround100");
                                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 32L, 1L);
                                        }
                                    }
                                } else if (i37 == 0) {
                                    com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeMiddlePercentAround0");
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 20L, 1L);
                                } else if (i37 <= 20) {
                                    com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeMiddlePercentAround20");
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 21L, 1L);
                                } else if (i37 <= 40) {
                                    com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeMiddlePercentAround40");
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 22L, 1L);
                                } else if (i37 <= 60) {
                                    com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeMiddlePercentAround60");
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 23L, 1L);
                                } else if (i37 <= 80) {
                                    com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeMiddlePercentAround80");
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 24L, 1L);
                                } else if (i37 <= 100) {
                                    com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeMiddlePercentAround100");
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 25L, 1L);
                                }
                            } else if (i37 == 0) {
                                com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeLowPercentAround0");
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 13L, 1L);
                            } else if (i37 <= 20) {
                                com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeLowPercentAround20");
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 14L, 1L);
                            } else if (i37 <= 40) {
                                com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeLowPercentAround40");
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 15L, 1L);
                            } else if (i37 <= 60) {
                                com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeLowPercentAround60");
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 16L, 1L);
                            } else if (i37 <= 80) {
                                com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeLowPercentAround80");
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 17L, 1L);
                            } else if (i37 <= 100) {
                                com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeLowPercentAround100");
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 18L, 1L);
                            }
                        } else if (i37 == 0) {
                            com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeSilentPercentAround0");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 6L, 1L);
                        } else if (i37 <= 20) {
                            com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeSilentPercentAround20");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 7L, 1L);
                        } else if (i37 <= 40) {
                            com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeSilentPercentAround40");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 8L, 1L);
                        } else if (i37 <= 60) {
                            com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeSilentPercentAround60");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 9L, 1L);
                        } else if (i37 <= 80) {
                            com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeSilentPercentAround80");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 10L, 1L);
                        } else if (i37 <= 100) {
                            com.tencent.mars.xlog.Log.i(str, "markPCMAmplitudeSilentPercentAround100");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 11L, 1L);
                        }
                    }
                } else if (i28 != 0) {
                    if (i28 != 1) {
                        if (i28 != 2) {
                            if (i28 == 3) {
                                if (i37 == 0) {
                                    com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeHighPercentAround0");
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 27L, 1L);
                                } else if (i37 <= 20) {
                                    com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeHighPercentAround20");
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 28L, 1L);
                                } else if (i37 <= 40) {
                                    com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeHighPercentAround40");
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 29L, 1L);
                                } else if (i37 <= 60) {
                                    com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeHighPercentAround60");
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 30L, 1L);
                                } else if (i37 <= 80) {
                                    com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeHighPercentAround80");
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 31L, 1L);
                                } else if (i37 == 100) {
                                    com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeHighPercentAround100");
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 32L, 1L);
                                }
                            }
                        } else if (i37 == 0) {
                            com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeMiddlePercentAround0");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 20L, 1L);
                        } else if (i37 <= 20) {
                            com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeMiddlePercentAround20");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 21L, 1L);
                        } else if (i37 <= 40) {
                            com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeMiddlePercentAround40");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 22L, 1L);
                        } else if (i37 <= 60) {
                            com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeMiddlePercentAround60");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 23L, 1L);
                        } else if (i37 <= 80) {
                            com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeMiddlePercentAround80");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 24L, 1L);
                        } else if (i37 == 100) {
                            com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeMiddlePercentAround100");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 25L, 1L);
                        }
                    } else if (i37 == 0) {
                        com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeLowPercentAround0");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 13L, 1L);
                    } else if (i37 <= 20) {
                        com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeLowPercentAround20");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 14L, 1L);
                    } else if (i37 <= 40) {
                        com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeLowPercentAround40");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 15L, 1L);
                    } else if (i37 <= 60) {
                        com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeLowPercentAround60");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 16L, 1L);
                    } else if (i37 <= 80) {
                        com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeLowPercentAround80");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 17L, 1L);
                    } else if (i37 == 100) {
                        com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeLowPercentAround100");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 18L, 1L);
                    }
                } else if (i37 == 0) {
                    com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeSilentPercentAround0");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 6L, 1L);
                } else if (i37 <= 20) {
                    com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeSilentPercentAround20");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 7L, 1L);
                } else if (i37 <= 40) {
                    com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeSilentPercentAround40");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 8L, 1L);
                } else if (i37 <= 60) {
                    com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeSilentPercentAround60");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 9L, 1L);
                } else if (i37 <= 80) {
                    com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeSilentPercentAround80");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 10L, 1L);
                } else if (i37 == 100) {
                    com.tencent.mars.xlog.Log.i(str5, "markPCMAmplitudeSilentPercentAround100");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 11L, 1L);
                }
                i27 = i38 + 1;
                i19 = i17;
                length = i18;
                numArr2 = numArr;
                i28 = i29;
            }
            wl.a.f446985b = 0;
            java.lang.Integer[] numArr3 = new java.lang.Integer[4];
            for (int i39 = 0; i39 < 4; i39++) {
                numArr3[i39] = 0;
            }
            wl.a.f446984a = numArr3;
        }
    }

    public void Ri(int i17) {
        java.lang.Integer[] numArr = wl.a.f446984a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markdoRecordReport");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 42L, 1L);
        } else {
            if (i17 != 1) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markdoRecordReport");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 42L, 1L);
        }
    }

    public void Ui(int i17) {
        java.lang.Integer[] numArr = wl.a.f446984a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markdoStartRecordError");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 40L, 1L);
        } else {
            if (i17 != 1) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markdoStartRecordError");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 40L, 1L);
        }
    }

    public void wi(int i17, int i18) {
        java.lang.Integer[] numArr = wl.a.f446984a;
        if (i17 == 0) {
            if (i18 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markAudioSourceUseMicFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 0L, 1L);
                return;
            } else {
                if (i18 != 7) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsgPCMRecorderIDKeyStat", "markAudioSourceUseVoiceCommunicationFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1201L, 1L, 1L);
                return;
            }
        }
        if (i17 != 1) {
            return;
        }
        if (i18 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markAudioSourceUseMic");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 0L, 1L);
        } else {
            if (i18 != 7) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VOIPPCMRecorderIDKeyStat", "markAudioSourceUseVoiceCommunicationFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1202L, 1L, 1L);
        }
    }
}
